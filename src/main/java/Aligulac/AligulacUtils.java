package Aligulac;

import Aligulac.MatchPrediction.Outcomes;
import Aligulac.MatchPrediction.Pla;
import Aligulac.MatchPrediction.PredictMatch;
import Aligulac.PlayerById.PlayerStats;
import Aligulac.PlayerByName.NameSearchResult;
import Aligulac.PlayerByName.Players;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class AligulacUtils {

    static String apikey = "19SpUSIbhyU4RqHWtTIM";
        static String rootURL = "http://aligulac.com/api/v1/";

    public static PlayerStats[] getTopTen() throws Exception{
        String inputLine;
        String queryURL = rootURL + "player/?current_rating__isnull=false&current_rating__decay__lt=4&order_by=-current_rating__rating&limit=10&format=json&apikey=" + apikey;
        StringBuffer response = new StringBuffer();

        URL url = new URL(queryURL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        while((inputLine = in.readLine())!= null){
            response.append(inputLine);
        }
        in.close();
        int important = response.indexOf("objects");
        System.out.println(response.substring(important+10, response.length()-1));
        Gson gson = new Gson();
        PlayerStats topTen = gson.fromJson(response.substring(important + 10).toString(), new TypeToken<List<PlayerStats>>() {}.getType());
        System.out.println(response);


        return new PlayerStats[] {};
    }

    public static PlayerStats getPlayerByName(String name) throws Exception{
        int id = getId(name);
        String inputLine;
        String queryURL = rootURL + "player/" + id + "/?format=json&apikey=" + apikey;
        StringBuffer response = new StringBuffer();

        URL url = new URL(queryURL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        while((inputLine = in.readLine())!= null){
            response.append(inputLine);
        }
        in.close();


        Gson gson = new Gson();

        PlayerStats stats = gson.fromJson(response.toString(), PlayerStats.class);

        return stats;
    }

    public static int getId(String name) throws Exception{
        String inputLine;
        String queryURL = "http://aligulac.com/search/json/?q=" + name;
        StringBuffer response = new StringBuffer();

        URL url = new URL(queryURL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        while((inputLine = in.readLine())!= null){
            response.append(inputLine);
        }
        in.close();
        Gson gson = new Gson();

        System.out.println(response);

        NameSearchResult result = gson.fromJson(response.toString(), NameSearchResult.class);

        ArrayList<Players> players = new ArrayList<>();
        for(Players p : result.getPlayers()){
            players.add(p);
        }

        if(players.size() > 1){
            return Integer.parseInt((players.get(0).getId()));
            //handle multiple results
        }
        else
            return Integer.parseInt(players.get(0).getId());
    }

    public static PredictMatch predictMatch(String player1, String player2, String numMatches) throws Exception {
        int id1 = getId(player1);
        int id2 = getId(player2);

        String inputLine;
        String queryURL = rootURL + "predictmatch/" + id1 + "," + id2 + "/?bo=" + numMatches + "&format=json&apikey=" + apikey;
        StringBuffer response = new StringBuffer();

        URL url = new URL(queryURL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        while((inputLine = in.readLine())!= null){
            response.append(inputLine);
        }
        in.close();

        Gson gson = new Gson();

        PredictMatch prediction = gson.fromJson(response.toString(), PredictMatch.class);

        for(Outcomes outcome : prediction.getOutcomes()){
            System.out.println(outcome.getProb());
        }
        return prediction;
    }

}

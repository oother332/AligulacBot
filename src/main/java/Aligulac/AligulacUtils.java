package Aligulac;

import com.google.gson.Gson;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class AligulacUtils {

    static String apikey = "19SpUSIbhyU4RqHWtTIM";
    static String rootURL = "http://aligulac.com/api/v1/";

    public static void getTopTen() throws Exception{
        String inputLine;
        String queryURL = rootURL + "activerating/?period=100&format=json&order_by=-rating&limit=10&apikey=" + apikey;
        StringBuffer response = new StringBuffer();

        URL url = new URL(queryURL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        while((inputLine = in.readLine())!= null){
            response.append(inputLine);
        }
        in.close();
        System.out.println(response);
    }

    public static void getPlayerByName(String name) throws Exception{
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
        System.out.println(response);
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

        AligulacPojo result = gson.fromJson(response.toString(), AligulacPojo.class);

        ArrayList<Players> players = new ArrayList<>();
        for(Players p : result.getPlayers()){
            players.add(p);
        }

        if(players.size() > 1){
            return -1;
            //handle multiple results
        }
        else
            return Integer.parseInt(players.get(0).getId());
    }


}

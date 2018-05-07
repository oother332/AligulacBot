package Aligulac;

import com.fasterxml.jackson.core.JsonParser;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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

        int id = response.charAt(response.indexOf("id") + 5);

        System.out.println(id);

        return id;
    }


}

package com.example.interfaces;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public interface InfoRetriever {

    /* The following methods retrieve the most recent bill from ProPublica.
        "getProPublica": This is where we connect to ProPublica with our private API Key.
             This method is repeated because every json file from each endpoint has to be manually cut down.
             ***PLEASE NOTE*** The substring may need to be altered for the following methods to work.
        "createObject": This converts the string of data to a JSON Object
        "mostRecent": This isolates a specific bill and returns its information.
    */

    String getProPublica() throws IOException;
    /* METHOD SETUP:

    URL url = new URL("https://api.propublica.org/congress/v1/bills/search.json?query=");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestProperty("X-API-Key", "O1ZdWmc8x27g8x05YHkc0VYKHfCBYTTTuvDAt4Kn");
        conn.setRequestProperty("Content-Type", "application/json");
    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

    String output;

    StringBuilder stringBuilder = new StringBuilder();
        while ((output = in.readLine()) != null) {
        stringBuilder.append(output);
    }
        in.close();

    ***Test the following to adjust the file into proper json format***
    String billResults = stringBuilder.substring(***int***, ***int***);

        return billResults;

     */

    JSONObject createObject(String text) throws IOException, JSONException;
    /* METHOD SETUP:
    return new JSONObject(text);
     */

    String mostRecent() throws IOException, JSONException;
    /* METHOD SETUP:
            String getInfo = getProPublica();
        JSONObject bills = createObject(getInfo);
        String title = (String) bills.getJSONArray("bills").getJSONObject(0).get("short_title");
        String shortSummary = (String) bills.getJSONArray("bills").getJSONObject(0).get("summary_short");
        return title + " " + shortSummary;
     */

}

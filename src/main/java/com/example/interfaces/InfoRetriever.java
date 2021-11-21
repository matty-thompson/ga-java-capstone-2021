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

    JSONObject createObject(String text) throws IOException, JSONException;

    String mostRecent() throws IOException, JSONException;
    
}

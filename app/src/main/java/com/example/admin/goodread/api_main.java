package com.example.admin.goodread;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Alphy Joseph on 9/7/2016.
 */
public class api_main {
    public static void apicall()
    {
    try {
        URL url = new URL("https://api.wattpad.com:443/v4/stories?"+"Authorizarion"="COmAsfoTl5bHFOoHoKl8uQCo12cA8sl2ytzk2RPu3uRB");
                HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
                urlConnection.connect();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            bufferedReader.close();
            return stringBuilder.toString();
        }
        finally{
            urlConnection.disconnect();
        }
    }
    catch(Exception e) {
        Log.e("ERROR", e.getMessage(), e);
        return null;
    }
}
}
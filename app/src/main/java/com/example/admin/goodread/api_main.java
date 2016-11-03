package com.example.admin.goodread;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by Alphy Joseph on 9/7/2016.
 */
public class api_main{
    static final String API_KEY = "COmAsfoTl5bHFOoHoKl8uQCo12cA8sl2ytzk2RPu3uRB";
    static final String API_URL = "https://api.wattpad.com:443/v4/stories?";


   /* public String apicall()
    {

        HttpClient client= new DefaultHttpClient();
        HttpGet request = new HttpGet();
        request.setHeader("Authorization","COmAsfoTl5bHFOoHoKl8uQCo12cA8sl2ytzk2RPu3uRB");
        HttpResponse response=client.execute(request);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append("\n");
        }
        bufferedReader.close();
        return stringBuilder.toString();



    }*/
    };



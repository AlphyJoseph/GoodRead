package com.example.admin.goodread;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by Alphy Joseph on 9/7/2016.
 */
public class api_main{
    public String apicall(String wattpad_api) throws ClientProtocolException,IOException
    {
      /*  URL url = new URL( "https://api.wattpad.com:443/v4/stories?"+ "Authorizarion"="COmAsfoTl5bHFOoHoKl8uQCo12cA8sl2ytzk2RPu3uRB");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();*/
        HttpClient client= new DefaultHttpClient();
        HttpGet request = new HttpGet();
        request.setHeader("Authorization","COmAsfoTl5bHFOoHoKl8uQCo12cA8sl2ytzk2RPu3uRB");
        HttpResponse response=client.execute(request);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line="";
        line=bufferedReader.readLine();
        return line;



    }
    }

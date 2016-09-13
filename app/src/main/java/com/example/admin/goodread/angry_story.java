package com.example.admin.goodread;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;

public class angry_story extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry_story);
    }
    public void listfunc()throws IOException,JSONException {
        api_main M = new api_main();
        M.apicall();
        String jsonstring="";
        JSONObject object = (JSONObject) new JSONTokener(jsonstring).nextValue();
        String requestID = object.getString("requestId");

        JSONArray title = object.getJSONArray("title");


        /////////////////////////////
        String[] angryopt = {"option1", "option2"};
        ListAdapter angryadpt = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, angryopt);
        ListView angrylist = (ListView) findViewById(R.id.angrylist);
        angrylist.setAdapter(angryadpt);

        angrylist.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent clicked = new Intent(angry_story.this, angry.class);
                        startActivity(clicked);
                    }
                }
        );

    }
    }



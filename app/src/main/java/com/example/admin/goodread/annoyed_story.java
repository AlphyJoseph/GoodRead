package com.example.admin.goodread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class annoyed_story extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annoyed_story);

        String[] happyopt={"option1","option2"};
        ListAdapter happyadpt= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,happyopt);
        ListView happylist=(ListView)findViewById(R.id.happylist);
        happylist.setAdapter(happyadpt);
    }
}

package com.example.admin.goodread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class angry_story extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry_story);

        String[] angryopt={"option1","option2"};
        ListAdapter angryadpt= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,angryopt);
        ListView angrylist=(ListView)findViewById(R.id.angrylist);
        angrylist.setAdapter(angryadpt);


    }
}


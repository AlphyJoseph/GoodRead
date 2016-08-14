package com.example.admin.goodread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class sad_story extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad_story);

        String[] sadopt={"option1","option2","option3"};
        ListAdapter sadadpt= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,sadopt);
        ListView sadlist=(ListView)findViewById(R.id.sadlist);
        sadlist.setAdapter(sadadpt);
    }
}

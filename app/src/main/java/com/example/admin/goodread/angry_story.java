package com.example.admin.goodread;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class angry_story extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        api_main M=new api_main();
        M.apicall();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry_story);

        String[] angryopt={"option1","option2"};
        ListAdapter angryadpt= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,angryopt);
        ListView angrylist=(ListView)findViewById(R.id.angrylist);
        angrylist.setAdapter(angryadpt);

        angrylist.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent clicked= new Intent(angry_story.this,angry.class);
                        startActivity(clicked);
                    }
                }
        );


    }
}


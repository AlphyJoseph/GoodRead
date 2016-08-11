package com.example.admin.goodread;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton annoyedImgButton;
    ImageButton sadImgButton;
    ImageButton angryImgButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Typeface myTypeface = Typeface.createFromAsset(getAssets(),"Rotulona-Hand-FFP.ttf");
       // TextView myTextView = (TextView) findViewById(R.id.text1);
       // myTextView.setTypeface(myTypeface);

        annoyedImgButton=(ImageButton)findViewById(R.id.annoyedImg);
        annoyedImgButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent annoy= new Intent(MainActivity.this,annoyed_story.class);
                startActivity(annoy);
            }
        });
        sadImgButton=(ImageButton)findViewById(R.id.sadImg);
        sadImgButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent annoy= new Intent(MainActivity.this,sad_story.class);
                startActivity(annoy);
            }
        });
        angryImgButton=(ImageButton)findViewById(R.id.angryImg);
        angryImgButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent annoy= new Intent(MainActivity.this,angry_story.class);
                startActivity(annoy);
            }
        });

        //angryImgButton= DialogInterface.OnClickListener(View OnClicklist)
    }

}

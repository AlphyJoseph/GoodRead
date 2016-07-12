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
        sadImgButton=(ImageButton)findViewById(R.id.sadImg);
        angryImgButton=(ImageButton)findViewById(R.id.angryImg);


        //angryImgButton= DialogInterface.OnClickListener(View OnClicklist)
    }
    public void onClick1(View view)
    {
        Intent annoy= new Intent(this,annoyed_story.class);
        startActivity(annoy);
    }
    public void onClick3(View view)
    {
        Intent angry=new Intent(this,angry_story.class);
        startActivity(angry);
    }
    public void onClick2(View view)
    {
        Intent sad=new Intent(this,sad_story.class);
        startActivity(sad);
    }
}

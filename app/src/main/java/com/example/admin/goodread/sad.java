package com.example.admin.goodread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class sad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);

        WebView browser = (WebView) findViewById(R.id.sadview);
        browser.loadUrl("http://www.tutorialspoint.com");
    }
}

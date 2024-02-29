package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webView);

        // Enable JavaScript (if needed)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load a URL
        webView.loadUrl("https://www.google.com/");
    }
}

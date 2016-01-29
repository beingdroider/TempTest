package com.demo.db.myapp.myapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class WebviewScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_screen);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "BR button actions", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ((TextView)findViewById(R.id.textView)).setText(getString(R.string.locale_actvity_header));

        ((WebView)findViewById(R.id.webView)).loadUrl("https://www.google.com.br");

        WebSettings webSettings = ((WebView)findViewById(R.id.webView)).getSettings();
        webSettings.setJavaScriptEnabled(true);
        ((WebView)findViewById(R.id.webView)).getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    }

}

package com.techroof.tipsoul.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.techroof.tipsoul.R;

public class ContactUsActivity extends AppCompatActivity {

    private WebView myProfileWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        myProfileWeb = findViewById(R.id.profileWeb);
        WebSettings webSettings = myProfileWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myProfileWeb.loadUrl("https://techroofsoftring.000webhostapp.com/");
        // Line of code opening links into app
        myProfileWeb.setWebViewClient(new WebViewClient());
    }

    // Code for back button
    @Override
    public void onBackPressed() {
        if(myProfileWeb.canGoBack())
        {
            myProfileWeb.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
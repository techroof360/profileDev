package com.techroof.tipsoul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.Calendar;

public class PortfoliosActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewFlipper quotesUpdate;
    private Button backward, forward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolios);

        Toolbar toolbar = findViewById(R.id.portfolio_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Portfolio");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        quotesUpdate = findViewById(R.id.quotesUpdates);
        backward = findViewById(R.id.backward);
        forward = findViewById(R.id.forward);

        backward.setOnClickListener(this);
        forward.setOnClickListener(this);

        //Copyright text
        TextView copyrightText = findViewById(R.id.copyrightText);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        copyrightText.setText("Tip-Soul© " + year);
    }

    @Override
    public void onClick(View v) {
        if (v == forward)
        {
            quotesUpdate.showNext();
        }
        else if (v == backward)
        {
            quotesUpdate.showPrevious();
        }
    }

}
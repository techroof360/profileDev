package com.techroof.tipsoul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.SliderView;
import com.techroof.tipsoul.Adapters.ImageSliderAdapter;
import com.techroof.tipsoul.Model.CardItemData;

import java.util.ArrayList;
import java.util.List;

public class OutSourcingActivity extends AppCompatActivity {

    private CardView card1;
    private SliderView sliderView;
    List<CardItemData> imageSliderModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_sourcing);


        Toolbar mToolbar = findViewById(R.id.outSource_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("IT OutSourcing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imageSliderModelList = new ArrayList<>();
        sliderView = findViewById(R.id.imageSlider);

        imageSliderModelList.add(new CardItemData(R.drawable.job_nts0, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job_ots1, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job_ppsc2, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job_pts3, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job4, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job5, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job6, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job7, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job8, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job9, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job10, "Job Opportunities"));
        imageSliderModelList.add(new CardItemData(R.drawable.job11, "Job Opportunities"));

        sliderView.setSliderAdapter(new ImageSliderAdapter(this, imageSliderModelList));

        card1 = findViewById(R.id.card_1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jobIntent = new Intent(OutSourcingActivity.this, PortfoliosActivity.class);
                startActivity(jobIntent);
            }
        });
    }
}
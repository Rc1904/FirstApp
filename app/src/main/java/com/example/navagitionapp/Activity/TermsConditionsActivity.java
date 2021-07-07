package com.example.navagitionapp.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navagitionapp.R;

public class TermsConditionsActivity extends AppCompatActivity {
    RelativeLayout back_image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_terms_conditions);

        back_image = findViewById (R.id.back_image);
        back_image.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finish ();
            }
        });
    }
}
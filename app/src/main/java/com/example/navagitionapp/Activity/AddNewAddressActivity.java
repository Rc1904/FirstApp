package com.example.navagitionapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navagitionapp.R;

public class AddNewAddressActivity extends AppCompatActivity {

    RelativeLayout back_image;
    Button add_addressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_add_new_address);


        back_image =findViewById (R.id.back_image);
        back_image.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finish ();
            }
        });

        add_addressButton = findViewById (R.id.add_addressButton);
        add_addressButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (AddNewAddressActivity.this, EditAddressActivity.class);
                startActivity (intent);
            }
        });

    }
}
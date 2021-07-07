package com.example.navagitionapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navagitionapp.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    RelativeLayout back_image;
    Button send_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_forgot_password);
    back_image = findViewById (R.id.back_image);
    back_image.setOnClickListener (new View.OnClickListener () {
        @Override
        public void onClick(View v) {
            finish ();
        }
    });

        send_button = findViewById (R.id.send_button);
        send_button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ForgotPasswordActivity.this, ChangePasswordActivity.class);
                startActivity (intent);
            }
        });
    }
}
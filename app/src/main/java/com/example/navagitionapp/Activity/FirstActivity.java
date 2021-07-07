package com.example.navagitionapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navagitionapp.R;

public class FirstActivity extends AppCompatActivity {

    Spinner language_spinner;
    ImageView imageView2;
    String[] language =  {"English", "Hindi", "Arabic"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_first);

        imageView2 = findViewById (R.id.imageView2);

        imageView2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (FirstActivity.this, LogInActivity.class);
                startActivity (intent);
            }
        });

         language_spinner = findViewById (R.id.language_spinner);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter (this, R.layout.spinner, language);
        arrayAdapter.setDropDownViewResource (android.R.layout.simple_spinner_dropdown_item);
//        arrayAdapter.add("English");
        language_spinner.setAdapter (arrayAdapter);
        language_spinner.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener () {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}
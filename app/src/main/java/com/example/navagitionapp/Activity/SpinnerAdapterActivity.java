package com.example.navagitionapp.Activity;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class SpinnerAdapterActivity extends ArrayAdapter<String> {

    ArrayList<String> Lang;

    public SpinnerAdapterActivity(@NonNull Context context, int resource) {
        super (context, resource);


    }

    @Override
    public int getCount() {
        int count = super.getCount();
        return count>0 ? count - 1: count;
       // return super.getCount ();
    }
}

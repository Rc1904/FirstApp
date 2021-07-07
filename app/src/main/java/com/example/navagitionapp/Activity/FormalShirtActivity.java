package com.example.navagitionapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.navagitionapp.R;

import java.util.ArrayList;

import Adapter.ModelCategories;
import Adapter.ModelProductName;
import Adapter.ProductNameAdapter;

public class FormalShirtActivity extends AppCompatActivity {

    RecyclerView productRecyclerView;
    ProductNameAdapter productNameAdapter;
    RecyclerView.LayoutManager mLayoutManagerDeal;
    ArrayList<ModelProductName> productHolder = new ArrayList<> ();
    RelativeLayout back_imageFormalShirt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_formal_shirt);

        back_imageFormalShirt = findViewById (R.id.back_imageFormalShirt);


        back_imageFormalShirt.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finish ();
            }
        });

        productRecyclerView = findViewById (R.id.recyclerView_formalShirt);
        productNameAdapter = new ProductNameAdapter (productHolder, FormalShirtActivity.this);
        mLayoutManagerDeal = new GridLayoutManager (FormalShirtActivity.this,2);
        productRecyclerView.setLayoutManager(mLayoutManagerDeal);
        productRecyclerView.scheduleLayoutAnimation();
        productRecyclerView.setItemAnimator(new DefaultItemAnimator ());
        productRecyclerView.setAdapter(productNameAdapter);

        productData();
    }

    public void productData()
    {


        ModelProductName ob1 = new ModelProductName ();
        ob1.setProductName ("Product Name");
        ob1.setPrice ("10.000 KWD");
        ob1.setProductImg (R.drawable.boy2);
        productHolder.add (ob1);

        ModelProductName ob2 = new ModelProductName ();
        ob2.setProductName ("Product Name");
        ob2.setPrice ("10.000 KWD");
        ob2.setProductImg (R.drawable.boy2);
        productHolder.add (ob2);


        ModelProductName ob3 = new ModelProductName ();
        ob3.setProductName ("Product Name");
        ob3.setPrice ("10.000 KWD");
        ob3.setProductImg (R.drawable.baby1);
        productHolder.add (ob3);

        ModelProductName ob4 = new ModelProductName ();
        ob4.setProductName ("Product Name");
        ob4.setPrice ("10.000 KWD");
        ob4.setProductImg (R.drawable.baby1);
        productHolder.add (ob4);

        ModelProductName ob5 = new ModelProductName ();
        ob5.setProductName ("Product Name");
        ob5.setPrice ("10.000 KWD");
        ob5.setProductImg (R.drawable.baby1);
        productHolder.add (ob5);

        ModelProductName ob6 = new ModelProductName ();
        ob6.setProductName ("Product Name");
        ob6.setPrice ("10.000 KWD");
        ob6.setProductImg (R.drawable.baby1);
        productHolder.add (ob6);

        productNameAdapter.notifyDataSetChanged ();
    }
}
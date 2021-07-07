package com.example.navagitionapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.navagitionapp.R;

import java.util.ArrayList;

import Adapter.ModelProductName;
import Adapter.ModelProductReviews;
import Adapter.ModelRelatedProduct;
import Adapter.ProductDetailsSliderAdapter;
import Adapter.ProductReviewAdapter;
import Adapter.RelatedProductAdapter;
import me.relex.circleindicator.CircleIndicator;

public class ProductDetailsActivity extends AppCompatActivity {
    RecyclerView recyclerView_relatedProduct, recyclerView_productReviews;
    ViewPager viewPager_productDetails;
    CircleIndicator indDots_productDetails;
    RelativeLayout back_imageProductDetails,rl_product,rl_details,rl_reviews,rl_xsSize, rl_sSize, rl_mSize, rl_lSize, rl_xlSize, rl_xxlSize;
    int[] image = {R.drawable.shirt2, R.drawable.shirt3, R.drawable.shirt4};
    ProductDetailsSliderAdapter productDetailsSliderAdapter;
    RelatedProductAdapter relatedProductAdapter;
    ProductReviewAdapter productReviewAdapter;
    ArrayList<ModelRelatedProduct> relatedProductArrayList = new ArrayList<> ();
    ArrayList<ModelProductReviews> reviewsArrayList = new ArrayList<> ();
    RecyclerView.LayoutManager rPLayoutManagerDeal;
    RecyclerView.LayoutManager reviewLayoutManagerDeal;
    TextView tx_detailsView,tx_reviewsView,tx_productProduct,tx_reviewsViewDetails,tx_productReviews,tx_productDetailsReviews;
    TextView tx_xsSize,tx_sSize,tx_mSize,tx_lSize,tx_xlSize,tx_xxlSize;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_product_details);

        recyclerView_relatedProduct = findViewById (R.id.recyclerView_relatedProduct);
        recyclerView_productReviews = findViewById (R.id.recyclerView_productReviews);

        back_imageProductDetails = findViewById (R.id.back_imageProductDetails);
        back_imageProductDetails.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finish ();
            }
        });

        viewPager_productDetails = findViewById (R.id.viewPager_productDetails);
        indDots_productDetails = findViewById (R.id.indDots_productDetails);

        rl_product = findViewById (R.id.rl_product);
        rl_details = findViewById (R.id.rl_details);
        rl_reviews = findViewById (R.id.rl_reviews);

        tx_detailsView = findViewById (R.id.tx_detailsView);
        tx_reviewsView = findViewById (R.id.tx_reviewsView);

        tx_productProduct =findViewById (R.id.tx_productProduct);
        tx_reviewsViewDetails = findViewById (R.id.tx_reviewsViewDetails);

        tx_productReviews=findViewById (R.id.tx_productReviews);
        tx_productDetailsReviews=findViewById (R.id.tx_productDetailsReviews);

        rl_xsSize=findViewById (R.id.rl_xsSize);
        rl_sSize=findViewById (R.id.rl_sSize);
        rl_mSize=findViewById (R.id.rl_mSize);
        rl_lSize=findViewById (R.id.rl_lSize);
        rl_xlSize=findViewById (R.id.rl_xlSize);
        rl_xxlSize=findViewById (R.id.rl_xxlSize);

        tx_xsSize=findViewById (R.id.tx_xsSize);
        tx_sSize=findViewById (R.id.tx_sSize);
        tx_mSize=findViewById (R.id.tx_mSize);
        tx_lSize=findViewById (R.id.tx_lSize);
        tx_xlSize=findViewById (R.id.tx_xlSize);
        tx_xxlSize=findViewById (R.id.tx_xxlSize);


        productDetailsSliderAdapter = new ProductDetailsSliderAdapter (ProductDetailsActivity.this,image);
        viewPager_productDetails.setAdapter (productDetailsSliderAdapter);
        indDots_productDetails.setViewPager (viewPager_productDetails);

        relatedProductAdapter = new RelatedProductAdapter (relatedProductArrayList, ProductDetailsActivity.this);
        rPLayoutManagerDeal = new GridLayoutManager (ProductDetailsActivity.this, 2);
        recyclerView_relatedProduct.setLayoutManager (rPLayoutManagerDeal);
        recyclerView_relatedProduct.scheduleLayoutAnimation();
        recyclerView_relatedProduct.setItemAnimator (new DefaultItemAnimator ());
        recyclerView_relatedProduct.setAdapter (relatedProductAdapter);

        productReviewAdapter = new ProductReviewAdapter (reviewsArrayList,ProductDetailsActivity.this);
        reviewLayoutManagerDeal = new GridLayoutManager (ProductDetailsActivity.this,1);
        recyclerView_productReviews.setLayoutManager (reviewLayoutManagerDeal);
        recyclerView_productReviews.scheduleLayoutAnimation();
        recyclerView_productReviews.setItemAnimator (new DefaultItemAnimator ());
        recyclerView_productReviews.setAdapter (productReviewAdapter);


        productReviews();
        relatedProductData();

        tx_detailsView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                rl_product.setVisibility (View.GONE);
                rl_details.setVisibility (View.VISIBLE);
                rl_reviews.setVisibility (View.GONE);
            }
        });
        tx_reviewsView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                rl_product.setVisibility (View.GONE);
                rl_details.setVisibility (View.GONE);
                rl_reviews.setVisibility (View.VISIBLE);
            }
        });

        tx_productProduct.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                rl_product.setVisibility (View.VISIBLE);
                rl_details.setVisibility (View.GONE);
                rl_reviews.setVisibility (View.GONE);

            }
        });
        tx_reviewsViewDetails.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                rl_product.setVisibility (View.GONE);
                rl_details.setVisibility (View.GONE);
                rl_reviews.setVisibility (View.VISIBLE);
            }
        });

        tx_productReviews.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                rl_product.setVisibility (View.VISIBLE);
                rl_details.setVisibility (View.GONE);
                rl_reviews.setVisibility (View.GONE);

            }
        });

        tx_productDetailsReviews.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                rl_product.setVisibility (View.GONE);
                rl_details.setVisibility (View.VISIBLE);
                rl_reviews.setVisibility (View.GONE);
            }
        });


        rl_xsSize.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                tx_xsSize.setTextColor (Color.WHITE);
                tx_sSize.setTextColor (Color.BLACK);
                tx_mSize.setTextColor (Color.BLACK);
                tx_lSize.setTextColor (Color.BLACK);
                tx_xlSize.setTextColor (Color.BLACK);
                tx_xxlSize.setTextColor (Color.BLACK);


                rl_xsSize.setBackgroundResource (R.drawable.round);
                rl_sSize.setBackgroundResource (R.drawable.white_round);
                rl_mSize.setBackgroundResource (R.drawable.white_round);
                rl_lSize.setBackgroundResource (R.drawable.white_round);
                rl_xlSize.setBackgroundResource (R.drawable.white_round);
                rl_xxlSize.setBackgroundResource (R.drawable.white_round);
            }
        });
        rl_sSize.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                tx_xsSize.setTextColor (Color.BLACK);
                tx_sSize.setTextColor (Color.WHITE);
                tx_mSize.setTextColor (Color.BLACK);
                tx_lSize.setTextColor (Color.BLACK);
                tx_xlSize.setTextColor (Color.BLACK);
                tx_xxlSize.setTextColor (Color.BLACK);
                rl_xsSize.setBackgroundResource (R.drawable.white_round);
                rl_sSize.setBackgroundResource (R.drawable.round);
                rl_mSize.setBackgroundResource (R.drawable.white_round);
                rl_lSize.setBackgroundResource (R.drawable.white_round);
                rl_xlSize.setBackgroundResource (R.drawable.white_round);
                rl_xxlSize.setBackgroundResource (R.drawable.white_round);            }
        });
        rl_mSize.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                tx_xsSize.setTextColor (Color.BLACK);
                tx_sSize.setTextColor (Color.BLACK);
                tx_lSize.setTextColor (Color.BLACK);
                tx_xlSize.setTextColor (Color.BLACK);
                tx_xxlSize.setTextColor (Color.BLACK);
                tx_mSize.setTextColor (Color.WHITE);

                rl_xsSize.setBackgroundResource (R.drawable.white_round);
                rl_sSize.setBackgroundResource (R.drawable.white_round);
                rl_mSize.setBackgroundResource (R.drawable.round);
                rl_lSize.setBackgroundResource (R.drawable.white_round);
                rl_xlSize.setBackgroundResource (R.drawable.white_round);
                rl_xxlSize.setBackgroundResource (R.drawable.white_round);             }
        });
        rl_lSize.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                tx_lSize.setTextColor (Color.WHITE);
                tx_xsSize.setTextColor (Color.BLACK);
                tx_sSize.setTextColor (Color.BLACK);
                tx_mSize.setTextColor (Color.BLACK);
                tx_xlSize.setTextColor (Color.BLACK);
                tx_xxlSize.setTextColor (Color.BLACK);

                rl_xsSize.setBackgroundResource (R.drawable.white_round);
                rl_sSize.setBackgroundResource (R.drawable.white_round);
                rl_mSize.setBackgroundResource (R.drawable.white_round);
                rl_lSize.setBackgroundResource (R.drawable.round);
                rl_xlSize.setBackgroundResource (R.drawable.white_round);
                rl_xxlSize.setBackgroundResource (R.drawable.white_round);            }
        });
        rl_xlSize.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                tx_xsSize.setTextColor (Color.BLACK);
                tx_sSize.setTextColor (Color.BLACK);
                tx_mSize.setTextColor (Color.BLACK);
                tx_lSize.setTextColor (Color.BLACK);
                tx_xlSize.setTextColor (Color.WHITE);
                tx_xxlSize.setTextColor (Color.BLACK);

                rl_xsSize.setBackgroundResource (R.drawable.white_round);
                rl_sSize.setBackgroundResource (R.drawable.white_round);
                rl_mSize.setBackgroundResource (R.drawable.white_round);
                rl_lSize.setBackgroundResource (R.drawable.white_round);
                rl_xlSize.setBackgroundResource (R.drawable.round);
                rl_xxlSize.setBackgroundResource (R.drawable.white_round);              }
        });
        rl_xxlSize.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                tx_xsSize.setTextColor (Color.BLACK);
                tx_sSize.setTextColor (Color.BLACK);
                tx_mSize.setTextColor (Color.BLACK);
                tx_lSize.setTextColor (Color.BLACK);
                tx_xlSize.setTextColor (Color.BLACK);
                tx_xxlSize.setTextColor (Color.WHITE);

                rl_xsSize.setBackgroundResource (R.drawable.white_round);
                rl_sSize.setBackgroundResource (R.drawable.white_round);
                rl_mSize.setBackgroundResource (R.drawable.white_round);
                rl_lSize.setBackgroundResource (R.drawable.white_round);
                rl_xlSize.setBackgroundResource (R.drawable.white_round);
                rl_xxlSize.setBackgroundResource (R.drawable.round);
            }
        });




    }

    public void relatedProductData()
    {


        ModelRelatedProduct ob1 = new ModelRelatedProduct ();
        ob1.setRelatedProductName ("Product Name");
        ob1.setRelatedProductPrice ("10.000 KWD");
        ob1.setRelatedProductImg (R.drawable.boy2);
        relatedProductArrayList.add (ob1);

        ModelRelatedProduct ob2 = new ModelRelatedProduct ();
        ob2.setRelatedProductName ("Product Name");
        ob2.setRelatedProductPrice ("10.000 KWD");
        ob2.setRelatedProductImg (R.drawable.boy2);
        relatedProductArrayList.add (ob2);


        ModelRelatedProduct ob3 = new ModelRelatedProduct ();
        ob3.setRelatedProductName ("Product Name");
        ob3.setRelatedProductPrice ("10.000 KWD");
        ob3.setRelatedProductImg (R.drawable.baby1);
        relatedProductArrayList.add (ob3);

        ModelRelatedProduct ob4 = new ModelRelatedProduct ();
        ob4.setRelatedProductName ("Product Name");
        ob4.setRelatedProductPrice ("10.000 KWD");
        ob4.setRelatedProductImg (R.drawable.baby1);
        relatedProductArrayList.add (ob4);

        ModelRelatedProduct ob5 = new ModelRelatedProduct ();
        ob5.setRelatedProductName ("Product Name");
        ob5.setRelatedProductPrice ("10.000 KWD");
        ob5.setRelatedProductImg (R.drawable.baby1);
        relatedProductArrayList.add (ob5);

        ModelRelatedProduct ob6 = new ModelRelatedProduct ();
        ob6.setRelatedProductName ("Product Name");
        ob6.setRelatedProductPrice ("10.000 KWD");
        ob6.setRelatedProductImg (R.drawable.baby1);
        relatedProductArrayList.add (ob6);


        relatedProductAdapter.notifyDataSetChanged ();

    }

    public void productReviews()
    {


        ModelProductReviews obj1 = new ModelProductReviews ();
        obj1.setReviewsPersonImg (R.drawable.boy2);
        obj1.setReviewsWord ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
        obj1.setReviewsPersonName ("Joe Dow");
        obj1.setReviewsDate ("10 Jan, 2020");
        obj1.setRatingReviews (5);
        reviewsArrayList.add (obj1);

        ModelProductReviews obj2 = new ModelProductReviews ();
        obj2.setReviewsPersonImg (R.drawable.baby1);
        obj2.setReviewsWord ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
        obj2.setReviewsPersonName ("Joe Dow");
        obj2.setReviewsDate ("10 Jan, 2020");
        obj2.setRatingReviews (5);
        reviewsArrayList.add (obj2);

        ModelProductReviews obj3 = new ModelProductReviews ();
        obj3.setReviewsPersonImg (R.drawable.child1);
        obj3.setReviewsWord ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt");
        obj3.setReviewsPersonName ("Joe Dow");
        obj3.setReviewsDate ("10 Jan, 2020");
        obj3.setRatingReviews (5);
        reviewsArrayList.add (obj3);




        productReviewAdapter.notifyDataSetChanged ();

    }
}
package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navagitionapp.R;

import java.util.ArrayList;

public class ProductReviewAdapter extends RecyclerView.Adapter<ProductReviewsHolder> {

    ArrayList<ModelProductReviews> reviewsArrayList = new ArrayList<> ();
    Context context;



    public ProductReviewAdapter(ArrayList<ModelProductReviews> data, Context context) {
       this.reviewsArrayList = data;
       this.context = context;

    }

    @NonNull
    @Override
    public ProductReviewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from (parent.getContext ());
        View view=inflater.inflate (R.layout.recycler_productreviews, parent,false);
        return  new ProductReviewsHolder (view);
    }



    @Override
    public void onBindViewHolder(@NonNull ProductReviewsHolder holder, int position) {


        holder.tx_reviewsWord.setText (reviewsArrayList.get (position). getReviewsWord () );
        holder.tx_reviewsWord.setText (reviewsArrayList.get (position). getReviewsWord () );
        holder.tx_date.setText (reviewsArrayList.get (position). getReviewsDate ());
        holder.img_reviews.setImageResource (reviewsArrayList.get (position).getReviewsPersonImg ());
        holder.rb_reviews.setRating (reviewsArrayList.get (position).getRatingReviews ());
    }


    @Override
    public int getItemCount() {
        return reviewsArrayList.size ();
    }
}

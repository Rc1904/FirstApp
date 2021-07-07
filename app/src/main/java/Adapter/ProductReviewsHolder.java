package Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navagitionapp.R;

public class ProductReviewsHolder extends RecyclerView.ViewHolder {


    ImageView img_reviews;
    TextView tx_date,tx_personName,tx_reviewsWord;
    RatingBar rb_reviews;
    public ProductReviewsHolder(@NonNull View itemView) {
        super (itemView);

        img_reviews =(ImageView)itemView.findViewById (R.id.img_reviews);
        rb_reviews =(RatingBar)itemView.findViewById (R.id.rb_reviews);
        tx_personName =(TextView)itemView.findViewById (R.id.tx_personName);
        tx_date =(TextView)itemView.findViewById (R.id.tx_date);
        tx_reviewsWord =(TextView)itemView.findViewById (R.id.tx_reviewsWord);

    }


}

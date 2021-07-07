package Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navagitionapp.R;

public class RelatedProductViewHolder extends RecyclerView.ViewHolder {


    ImageView img_relatedProduct;
    TextView tx_relatedProductName,tx_relatedProductPrice;
    public RelatedProductViewHolder(@NonNull View itemView) {
        super (itemView);

        img_relatedProduct =(ImageView)itemView.findViewById (R.id.img_relatedProduct);
        tx_relatedProductName =(TextView)itemView.findViewById (R.id.tx_relatedProductName);
        tx_relatedProductPrice =(TextView)itemView.findViewById (R.id.tx_relatedProductPrice);

    }


}

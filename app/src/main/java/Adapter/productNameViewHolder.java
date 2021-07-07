package Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navagitionapp.R;

public class productNameViewHolder extends RecyclerView.ViewHolder {


    ImageView img_product;
    TextView tx_productName,tx_price;
    public productNameViewHolder(@NonNull View itemView) {
        super (itemView);

        img_product =(ImageView)itemView.findViewById (R.id.img_formalShirt);
        tx_productName =(TextView)itemView.findViewById (R.id.tx_productName);
        tx_price =(TextView)itemView.findViewById (R.id.tx_productPrice);

    }


}

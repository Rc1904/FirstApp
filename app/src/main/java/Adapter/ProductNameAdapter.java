package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navagitionapp.Activity.ProductDetailsActivity;
import com.example.navagitionapp.R;

import java.util.ArrayList;

public class ProductNameAdapter extends RecyclerView.Adapter<productNameViewHolder> {

    ArrayList<ModelProductName> productHolder = new ArrayList<> ();
    Context context;



    public ProductNameAdapter(ArrayList<ModelProductName> data,Context context) {
       this.productHolder = data;
       this.context = context;

    }

    @NonNull
    @Override
    public productNameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from (parent.getContext ());
        View view=inflater.inflate (R.layout.formal_shirt, parent,false);
        return  new productNameViewHolder (view);
    }



    @Override
    public void onBindViewHolder(@NonNull productNameViewHolder holder, int position) {


        holder.tx_productName.setText (productHolder.get (position). getProductName () );
        holder.tx_price.setText (productHolder.get (position). getPrice ());
        holder.img_product.setImageResource (productHolder.get (position).getProductImg ());

        holder.img_product.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ProductDetailsActivity.class);
                context.startActivity (intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return productHolder.size ();
    }
}

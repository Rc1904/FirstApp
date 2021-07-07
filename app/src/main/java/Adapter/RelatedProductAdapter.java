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

public class RelatedProductAdapter extends RecyclerView.Adapter<RelatedProductViewHolder> {

    ArrayList<ModelRelatedProduct> relatedProductArrayList = new ArrayList<> ();
    Context context;



    public RelatedProductAdapter(ArrayList<ModelRelatedProduct> data, Context context) {
       this.relatedProductArrayList = data;
       this.context = context;

    }

    @NonNull
    @Override
    public RelatedProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from (parent.getContext ());
        View view=inflater.inflate (R.layout.relatedproduct_receyler, parent,false);
        return  new RelatedProductViewHolder (view);
    }



    @Override
    public void onBindViewHolder(@NonNull RelatedProductViewHolder holder, int position) {


        holder.tx_relatedProductName.setText (relatedProductArrayList.get (position). getRelatedProductName () );
        holder.tx_relatedProductPrice.setText (relatedProductArrayList.get (position). getRelatedProductPrice ());
        holder.img_relatedProduct.setImageResource (relatedProductArrayList.get (position).getRelatedProductImg ());
    }


    @Override
    public int getItemCount() {
        return relatedProductArrayList.size ();
    }
}

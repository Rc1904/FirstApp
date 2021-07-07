package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navagitionapp.Activity.FormalShirtActivity;
import com.example.navagitionapp.R;

import java.util.ArrayList;

public class CategoriesItemsAdapter extends RecyclerView.Adapter<categoriesItemsHolder> {

    ArrayList<ModelCategoriesItems> productData;
    Context context;

    public CategoriesItemsAdapter(ArrayList<ModelCategoriesItems> data,Context context ) {
        this.productData = data;
        this.context = context;
    }

    @NonNull
    @Override
    public categoriesItemsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from (parent.getContext ());
        View view=inflater.inflate (R.layout.categories_item, parent,false);
        return  new categoriesItemsHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull categoriesItemsHolder holder, int position) {

        holder.tx.setText (productData.get (position).getProductName ());
        holder.img.setImageResource (productData.get (position).getSideArrowImg ());
        holder.img.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (context, FormalShirtActivity.class);
                context.startActivity (intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return productData.size ();
    }
}

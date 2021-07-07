package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navagitionapp.R;

import java.util.ArrayList;

import Interface.MyClickListener;

public class CategoriesAdapter extends RecyclerView.Adapter<categoriesViewHolder> {

    ArrayList<ModelCategories> catData;
    MyClickListener mMyClickListener;

    public CategoriesAdapter(ArrayList<ModelCategories> data, MyClickListener myClickListener ) {
        this.catData = data;
        this.mMyClickListener = myClickListener;
    }

    @NonNull
    @Override
    public categoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from (parent.getContext ());
        View view=inflater.inflate (R.layout.categories_slider, parent,false);
        return  new categoriesViewHolder (view);
    }



    @Override
    public void onBindViewHolder(@NonNull categoriesViewHolder holder, int position) {

        holder.tx.setText (catData.get (position).getCatname ());
        holder.img.setImageResource (catData.get (position).getCatimg ());

        holder.img.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                mMyClickListener.onItemClick (catData.get (position).getCatname ());
            }
        });

    }

    @Override
    public int getItemCount() {
        return catData.size ();
    }
}

package Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navagitionapp.R;

public class categoriesViewHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView tx;
    public categoriesViewHolder(@NonNull View itemView) {
        super (itemView);

        img =(ImageView)itemView.findViewById (R.id.img_categoriesProduct);
        tx =(TextView)itemView.findViewById (R.id.tx_categoriesProduct);


    }
}

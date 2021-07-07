package Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navagitionapp.R;

public class categoriesItemsHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView tx;
    public categoriesItemsHolder(@NonNull View itemView) {
        super (itemView);

        img =(ImageView)itemView.findViewById (R.id.img_categoriesItems);
        tx =(TextView)itemView.findViewById (R.id.tx_categoriesItems);
    }


}

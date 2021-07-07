package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.navagitionapp.R;

import java.util.Objects;

public class ProductDetailsSliderAdapter extends PagerAdapter {

    private  int[] images;
    private Context context;
    private  LayoutInflater mLayoutInflater;

    public ProductDetailsSliderAdapter(Context context, int[] images ) {
        this.images = images;
        this.context =context;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((RelativeLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {

        View itemView = mLayoutInflater.inflate (R.layout.product_details_viewpager, container, false);

        ImageView imageView = (ImageView) itemView.findViewById (R.id.img_productDetails);

        imageView.setImageResource (images[position]);

        Objects.requireNonNull (container).addView (itemView);

        return itemView;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView ((RelativeLayout) object);
    }
}

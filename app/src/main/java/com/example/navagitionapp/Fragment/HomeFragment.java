package com.example.navagitionapp.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navagitionapp.Activity.MainActivity;
import com.example.navagitionapp.R;

import java.util.ArrayList;

import Adapter.HomeSliderAdapter;
import Adapter.Model;
import Adapter.myAdapter;
import me.relex.circleindicator.CircleIndicator;


public class HomeFragment extends Fragment {

    RecyclerView rcv;
    myAdapter adapter1;
    ViewPager viewPager;
    CircleIndicator circleIndicator;
    int[] image = {R.drawable.child1, R.drawable.child2, R.drawable.child3,R.drawable.child4};
    private onFragmentBtnSelected listener;
    HomeSliderAdapter adapter;




    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate (R.layout.fragment_home, container,false );
        viewPager = view.findViewById (R.id.view_pager);
        circleIndicator = view.findViewById (R.id.ind_dots);
        rcv = view.findViewById (R.id.rcv);
        rcv.setLayoutManager (new LinearLayoutManager (getActivity (),LinearLayoutManager.HORIZONTAL,false));

        adapter1 = new myAdapter (dataqueue ());
        rcv.setAdapter (adapter1);


        adapter = new HomeSliderAdapter (getActivity (), image);

        viewPager.setAdapter (adapter);
        circleIndicator.setViewPager (viewPager);

        return view;
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach (context);
        if (context instanceof onFragmentBtnSelected) {
            listener = (onFragmentBtnSelected) context;
        } else {
            throw new ClassCastException (context.toString () + "must implement listener");
        }
    }

    public interface onFragmentBtnSelected{
        public void onButtonSelected();
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder = new ArrayList<> ();

        Model ob1 = new Model ();
        ob1.setHeader ("Product Name");
        ob1.setImg (R.drawable.baby1);
        holder.add (ob1);

        Model ob2 = new Model ();
        ob2.setHeader ("Product Name");
        ob2.setImg (R.drawable.child1);
        holder.add (ob2);


        Model ob3 = new Model ();
        ob3.setHeader ("Product Name");
        ob3.setImg (R.drawable.child2);
        holder.add (ob3);

        Model ob4 = new Model ();
        ob4.setHeader ("Product Name");
        ob4.setImg (R.drawable.child3);
        holder.add (ob4);

        Model ob5 = new Model ();
        ob5.setHeader ("Product Name");
        ob5.setImg (R.drawable.men1);
        holder.add (ob5);

        Model ob6 = new Model ();
        ob6.setHeader ("Product Name");
        ob6.setImg (R.drawable.man2);
        holder.add (ob6);

        return holder;
    }


}
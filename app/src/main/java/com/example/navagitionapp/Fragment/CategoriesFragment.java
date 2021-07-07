package com.example.navagitionapp.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navagitionapp.R;

import java.util.ArrayList;

import Adapter.CategoriesAdapter;
import Adapter.CategoriesItemsAdapter;
import Adapter.Model;
import Adapter.ModelCategories;
import Adapter.ModelCategoriesItems;
import Adapter.categoriesItemsHolder;
import Interface.MyClickListener;
import Interface.OnProductType;

public class CategoriesFragment extends Fragment implements MyClickListener {

    RecyclerView recyclerViewCategories,getRecyclerViewCategoriesItems;
    CategoriesAdapter categoriesAdapter;
    CategoriesItemsAdapter categoriesItemsAdapter;
    int[] image = {R.drawable.sidearrow};
    MyClickListener myClickListener;
    String CatValue;
    ArrayList<ModelCategoriesItems> categoriesItemsHolder = new ArrayList<> ();
    ArrayList<ModelCategoriesItems> categoriesWomenItems = new ArrayList<> ();
    ArrayList<ModelCategoriesItems> categoriesBoyItems = new ArrayList<> ();
    ArrayList<ModelCategoriesItems> categoriesGirlItems = new ArrayList<> ();



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate (R.layout.fragment_categories, container,false );
        recyclerViewCategories = view.findViewById (R.id.recyclerView_categories);
        getRecyclerViewCategoriesItems = view.findViewById (R.id.recyclerView_categoriesItems);
        myClickListener = this;

        recyclerViewCategories.setLayoutManager (new LinearLayoutManager (getActivity ()));
        getRecyclerViewCategoriesItems.setLayoutManager (new LinearLayoutManager (getActivity ()));

        categoriesAdapter = new CategoriesAdapter (categoriesDataqueue (), myClickListener);
        categoriesItemsAdapter = new CategoriesItemsAdapter (categoriesItemsDataqueue (), getActivity ());
        recyclerViewCategories.setAdapter (categoriesAdapter);
        getRecyclerViewCategoriesItems.setAdapter (categoriesItemsAdapter);




            return view;


    }



    public ArrayList<ModelCategories> categoriesDataqueue()
    {
        ArrayList<ModelCategories> categoriesHolder = new ArrayList<> ();

        ModelCategories ob1 = new ModelCategories ();
        ob1.setCatname ("Men");
        ob1.setCatimg (R.drawable.men1);
        categoriesHolder.add (ob1);

        ModelCategories ob2 = new ModelCategories ();
        ob2.setCatname ("Women");
        ob2.setCatimg (R.drawable.woman);
        categoriesHolder.add (ob2);


        ModelCategories ob3 = new ModelCategories ();
        ob3.setCatname ("Boy");
        ob3.setCatimg (R.drawable.child1);
        categoriesHolder.add (ob3);

        ModelCategories ob4 = new ModelCategories ();
        ob4.setCatname ("Girl");
        ob4.setCatimg (R.drawable.child2);
        categoriesHolder.add (ob4);


        return categoriesHolder;
    }




    public ArrayList<ModelCategoriesItems> categoriesItemsDataqueue()
    {
        if (categoriesItemsHolder != null)
        {
            categoriesItemsHolder.clear ();
        }
        ModelCategoriesItems ob1 = new ModelCategoriesItems ();
        ob1.setProductName ("Men Product Type");
        ob1.setSideArrowImg (R.drawable.sidearrow);
        categoriesItemsHolder.add (ob1);

        ModelCategoriesItems ob2 = new ModelCategoriesItems ();
        ob2.setProductName ("Men Product Type");
        ob2.setSideArrowImg (R.drawable.sidearrow);
        categoriesItemsHolder.add (ob2);


        ModelCategoriesItems ob3 = new ModelCategoriesItems ();
        ob3.setProductName ("Men Product Type");
        ob3.setSideArrowImg (R.drawable.sidearrow);
        categoriesItemsHolder.add (ob3);

        ModelCategoriesItems ob4 = new ModelCategoriesItems ();
        ob4.setProductName ("Men Product Type");
        ob4.setSideArrowImg (R.drawable.sidearrow);
        categoriesItemsHolder.add (ob4);

        ModelCategoriesItems ob5 = new ModelCategoriesItems ();
        ob5.setProductName ("Men Product Type");
        ob5.setSideArrowImg (R.drawable.sidearrow);
        categoriesItemsHolder.add (ob5);

        ModelCategoriesItems ob6 = new ModelCategoriesItems ();
        ob6.setProductName ("Men Product Type");
        ob6.setSideArrowImg (R.drawable.sidearrow);
        categoriesItemsHolder.add (ob6);


        ModelCategoriesItems ob7 = new ModelCategoriesItems ();
        ob7.setProductName ("Men Product Type");
        ob7.setSideArrowImg (R.drawable.sidearrow);
        categoriesItemsHolder.add (ob7);

        ModelCategoriesItems ob8 = new ModelCategoriesItems ();
        ob8.setProductName ("Men Product Type");
        ob8.setSideArrowImg (R.drawable.sidearrow);
        categoriesItemsHolder.add (ob8);


        return categoriesItemsHolder;
    }
    public ArrayList<ModelCategoriesItems> categoriesWomenItems()
    {
        if(categoriesWomenItems != null)
        {
            categoriesWomenItems.clear ();
        }

        ModelCategoriesItems ob1 = new ModelCategoriesItems ();
        ob1.setProductName ("Women Product Type");
        ob1.setSideArrowImg (R.drawable.sidearrow);
        categoriesWomenItems.add (ob1);

        ModelCategoriesItems ob2 = new ModelCategoriesItems ();
        ob2.setProductName ("Women Product Type");
        ob2.setSideArrowImg (R.drawable.sidearrow);
        categoriesWomenItems.add (ob2);


        ModelCategoriesItems ob3 = new ModelCategoriesItems ();
        ob3.setProductName ("Women Product Type");
        ob3.setSideArrowImg (R.drawable.sidearrow);
        categoriesWomenItems.add (ob3);

        ModelCategoriesItems ob4 = new ModelCategoriesItems ();
        ob4.setProductName ("Women Product Type");
        ob4.setSideArrowImg (R.drawable.sidearrow);
        categoriesWomenItems.add (ob4);

        ModelCategoriesItems ob5 = new ModelCategoriesItems ();
        ob5.setProductName ("Women Product Type");
        ob5.setSideArrowImg (R.drawable.sidearrow);
        categoriesWomenItems.add (ob5);

        ModelCategoriesItems ob6 = new ModelCategoriesItems ();
        ob6.setProductName ("Women Product Type");
        ob6.setSideArrowImg (R.drawable.sidearrow);
        categoriesWomenItems.add (ob6);


        ModelCategoriesItems ob7 = new ModelCategoriesItems ();
        ob7.setProductName ("Women Product Type");
        ob7.setSideArrowImg (R.drawable.sidearrow);
        categoriesWomenItems.add (ob7);

        ModelCategoriesItems ob8 = new ModelCategoriesItems ();
        ob8.setProductName ("Women Product Type");
        ob8.setSideArrowImg (R.drawable.sidearrow);
        categoriesWomenItems.add (ob8);


        return categoriesWomenItems;
    }
    public ArrayList<ModelCategoriesItems> categoriesBoyItems()
    {
        if(categoriesBoyItems != null)
        {
            categoriesBoyItems.clear ();
        }

        ModelCategoriesItems ob1 = new ModelCategoriesItems ();
        ob1.setProductName ("Boys Product Type");
        ob1.setSideArrowImg (R.drawable.sidearrow);
        categoriesBoyItems.add (ob1);

        ModelCategoriesItems ob2 = new ModelCategoriesItems ();
        ob2.setProductName ("Boys Product Type");
        ob2.setSideArrowImg (R.drawable.sidearrow);
        categoriesBoyItems.add (ob2);


        ModelCategoriesItems ob3 = new ModelCategoriesItems ();
        ob3.setProductName ("Boys Product Type");
        ob3.setSideArrowImg (R.drawable.sidearrow);
        categoriesBoyItems.add (ob3);

        ModelCategoriesItems ob4 = new ModelCategoriesItems ();
        ob4.setProductName ("Boys Product Type");
        ob4.setSideArrowImg (R.drawable.sidearrow);
        categoriesBoyItems.add (ob4);

        ModelCategoriesItems ob5 = new ModelCategoriesItems ();
        ob5.setProductName ("Boys Product Type");
        ob5.setSideArrowImg (R.drawable.sidearrow);
        categoriesBoyItems.add (ob5);

        ModelCategoriesItems ob6 = new ModelCategoriesItems ();
        ob6.setProductName ("Boys Product Type");
        ob6.setSideArrowImg (R.drawable.sidearrow);
        categoriesBoyItems.add (ob6);


        ModelCategoriesItems ob7 = new ModelCategoriesItems ();
        ob7.setProductName ("Boys Product Type");
        ob7.setSideArrowImg (R.drawable.sidearrow);
        categoriesBoyItems.add (ob7);

        ModelCategoriesItems ob8 = new ModelCategoriesItems ();
        ob8.setProductName ("Boys Product Type");
        ob8.setSideArrowImg (R.drawable.sidearrow);
        categoriesBoyItems.add (ob8);


        return categoriesBoyItems;
    }
    public ArrayList<ModelCategoriesItems> categoriesGirlItems()
    {

        if(categoriesGirlItems != null){
            categoriesGirlItems.clear();
        }
        ModelCategoriesItems ob1 = new ModelCategoriesItems ();
        ob1.setProductName ("Girl Product Type");
        ob1.setSideArrowImg (R.drawable.sidearrow);
        categoriesGirlItems.add (ob1);

        ModelCategoriesItems ob2 = new ModelCategoriesItems ();
        ob2.setProductName ("Girl Product Type");
        ob2.setSideArrowImg (R.drawable.sidearrow);
        categoriesGirlItems.add (ob2);


        ModelCategoriesItems ob3 = new ModelCategoriesItems ();
        ob3.setProductName ("Girl Product Type");
        ob3.setSideArrowImg (R.drawable.sidearrow);
        categoriesGirlItems.add (ob3);

        ModelCategoriesItems ob4 = new ModelCategoriesItems ();
        ob4.setProductName ("Girl Product Type");
        ob4.setSideArrowImg (R.drawable.sidearrow);
        categoriesGirlItems.add (ob4);

        ModelCategoriesItems ob5 = new ModelCategoriesItems ();
        ob5.setProductName ("Girl Product Type");
        ob5.setSideArrowImg (R.drawable.sidearrow);
        categoriesGirlItems.add (ob5);

        ModelCategoriesItems ob6 = new ModelCategoriesItems ();
        ob6.setProductName ("Girl Product Type");
        ob6.setSideArrowImg (R.drawable.sidearrow);
        categoriesGirlItems.add (ob6);


        ModelCategoriesItems ob7 = new ModelCategoriesItems ();
        ob7.setProductName ("Girl Product Type");
        ob7.setSideArrowImg (R.drawable.sidearrow);
        categoriesGirlItems.add (ob7);

        ModelCategoriesItems ob8 = new ModelCategoriesItems ();
        ob8.setProductName ("Girl Product Type");
        ob8.setSideArrowImg (R.drawable.sidearrow);
        categoriesGirlItems.add (ob8);


        return categoriesGirlItems;
    }


    @Override
    public void onItemClick(String categoryName) {
        CatValue = categoryName;

        /*System.out.println (CatValue+"juiuhjyihy");
        System.out.println (categoriesItemsHolder.get (0).getHeader ()+"=uuiijuiuhjyihy");*/
        if(CatValue != null){
            if (CatValue.equalsIgnoreCase ("Men"))
            {

                categoriesItemsAdapter = new CategoriesItemsAdapter (categoriesItemsHolder, getActivity ()
                );
                getRecyclerViewCategoriesItems.setAdapter (categoriesItemsAdapter);
                categoriesItemsAdapter.notifyDataSetChanged ();
            }
            else  if (CatValue.equalsIgnoreCase ("Women"))
            {
                categoriesWomenItems();
                categoriesItemsAdapter = new CategoriesItemsAdapter (categoriesWomenItems, getActivity ()
                );
                getRecyclerViewCategoriesItems.setAdapter (categoriesItemsAdapter);
                categoriesItemsAdapter.notifyDataSetChanged ();
            }
            else  if (CatValue.equalsIgnoreCase ("Boy"))
            {
                categoriesBoyItems();
                categoriesItemsAdapter = new CategoriesItemsAdapter (categoriesBoyItems, getActivity ()
                );
                getRecyclerViewCategoriesItems.setAdapter (categoriesItemsAdapter);
                categoriesItemsAdapter.notifyDataSetChanged ();
            }
            else  if (CatValue.equalsIgnoreCase ("Girl"))
            {

                categoriesGirlItems() ;
                categoriesItemsAdapter = new CategoriesItemsAdapter (categoriesGirlItems, getActivity ()
                );
                getRecyclerViewCategoriesItems.setAdapter (categoriesItemsAdapter);
                categoriesItemsAdapter.notifyDataSetChanged ();
            }
        }

    }


}
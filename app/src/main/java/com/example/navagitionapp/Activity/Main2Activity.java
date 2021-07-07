package com.example.navagitionapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.navagitionapp.Fragment.AccountFragment;
import com.example.navagitionapp.Fragment.CategoriesFragment;
import com.example.navagitionapp.Fragment.HomeFragment;
import com.example.navagitionapp.Fragment.SearchFragment;
import com.example.navagitionapp.Fragment.SetttingFragment;
import com.example.navagitionapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, HomeFragment.onFragmentBtnSelected {

    BottomNavigationView bnv;
    DrawerLayout drawer_layout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);
        toolbar = findViewById (R.id.toolbar);
        setSupportActionBar (toolbar);


        drawer_layout = findViewById (R.id.drawer_layout);
        navigationView = findViewById (R.id.navigationView);
        navigationView.setNavigationItemSelectedListener (this);


        actionBarDrawerToggle = new ActionBarDrawerToggle (this, drawer_layout, toolbar, R.string.open, R.string.close);
        drawer_layout.addDrawerListener (actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled (true);
        actionBarDrawerToggle.syncState ();

        bnv = findViewById (R.id.bottomNavigation);


        fragmentManager = getSupportFragmentManager ();
        fragmentTransaction = fragmentManager.beginTransaction ();
        fragmentTransaction.add (R.id.container_fragment, new HomeFragment ());
        fragmentTransaction.commit ();

        bnv.setOnNavigationItemSelectedListener (new BottomNavigationView.OnNavigationItemSelectedListener () {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {



                switch (item.getItemId ()) {
                    case R.id.btm_menu_home:
                        fragmentManager = getSupportFragmentManager ();
                        fragmentTransaction = fragmentManager.beginTransaction ();
                        fragmentTransaction.replace (R.id.container_fragment, new HomeFragment ());
                        fragmentTransaction.commit ();
                        break;
                    case R.id.btm_menu_categories:
                        fragmentManager = getSupportFragmentManager ();
                        fragmentTransaction = fragmentManager.beginTransaction ();
                        fragmentTransaction.replace (R.id.container_fragment, new CategoriesFragment ());
                        fragmentTransaction.commit ();
                        break;

                    case R.id.btm_menu_search:
                        fragmentManager = getSupportFragmentManager ();
                        fragmentTransaction = fragmentManager.beginTransaction ();
                        fragmentTransaction.replace (R.id.container_fragment, new SearchFragment ());
                        fragmentTransaction.commit ();
                        break;

                    case R.id.btm_menu_account:
                        fragmentManager = getSupportFragmentManager ();
                        fragmentTransaction = fragmentManager.beginTransaction ();
                        fragmentTransaction.replace (R.id.container_fragment, new AccountFragment ());
                        fragmentTransaction.commit ();
                        break;

                    case R.id.btm_menu_setting:
                        fragmentManager = getSupportFragmentManager ();
                        fragmentTransaction = fragmentManager.beginTransaction ();
                        fragmentTransaction.replace (R.id.container_fragment, new SetttingFragment ());
                        fragmentTransaction.commit ();
                        break;

                }


                return true;
            }
        });


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId () == R.id.menu_home) {
            fragmentManager = getSupportFragmentManager ();
            fragmentTransaction = fragmentManager.beginTransaction ();
            fragmentTransaction.replace (R.id.container_fragment, new HomeFragment ());
            fragmentTransaction.commit ();

        }

        if (item.getItemId () == R.id.menu_categories) {
            fragmentManager = getSupportFragmentManager ();
            fragmentTransaction = fragmentManager.beginTransaction ();
            fragmentTransaction.replace (R.id.container_fragment, new CategoriesFragment ());
            fragmentTransaction.commit ();

        }

        if (item.getItemId () == R.id.menu_search) {
            fragmentManager = getSupportFragmentManager ();
            fragmentTransaction = fragmentManager.beginTransaction ();
            fragmentTransaction.replace (R.id.container_fragment, new SearchFragment ());
            fragmentTransaction.commit ();

        }
        if (item.getItemId () == R.id.menu_account) {
            fragmentManager = getSupportFragmentManager ();
            fragmentTransaction = fragmentManager.beginTransaction ();
            fragmentTransaction.replace (R.id.container_fragment, new AccountFragment ());
            fragmentTransaction.commit ();
        }

        if (item.getItemId () == R.id.menu_settings) {
            fragmentManager = getSupportFragmentManager ();
            fragmentTransaction = fragmentManager.beginTransaction ();
            fragmentTransaction.replace (R.id.container_fragment, new SetttingFragment  ());
            fragmentTransaction.commit ();
        }


        drawer_layout.closeDrawer (GravityCompat.START);
        return true;
    }

    @Override
    public void onButtonSelected() {
        fragmentManager = getSupportFragmentManager ();
        fragmentTransaction = fragmentManager.beginTransaction ();
        fragmentTransaction.replace (R.id.container_fragment, new SetttingFragment ());
        fragmentTransaction.commit ();

    }

}
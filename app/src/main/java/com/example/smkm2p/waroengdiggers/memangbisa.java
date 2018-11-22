package com.example.smkm2p.waroengdiggers;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.smkm2p.waroengdiggers.mFragment.MyPageAdapter;
import com.example.smkm2p.waroengdiggers.mFragment.fragmentmakanan;
import com.example.smkm2p.waroengdiggers.mFragment.fragmentminuman;
import com.example.smkm2p.waroengdiggers.mFragment.fragmentspesial;

public class memangbisa extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    ViewPager vp;
    TabLayout   tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memangbisa);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        //.setAction("Action", null).show();
            }
        });

        vp = (ViewPager) findViewById(R.id.mviewpager);
        this.addPages();


        tabLayout = findViewById(R.id.mTab);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);
    }

    private void addPages () {
        MyPageAdapter myPageAdapter = new MyPageAdapter(this.getSupportFragmentManager());
        myPageAdapter.addPage(new fragmentmakanan());
        myPageAdapter.addPage(new fragmentminuman());
        myPageAdapter.addPage(new fragmentspesial());

        vp.setAdapter(myPageAdapter);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}

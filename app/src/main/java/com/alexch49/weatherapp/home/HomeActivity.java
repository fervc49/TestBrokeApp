package com.alexch49.weatherapp.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.alexch49.weatherapp.BaseApp;
import com.alexch49.weatherapp.R;
import com.alexch49.weatherapp.networking.Service;

import javax.inject.Inject;

public class HomeActivity extends BaseApp implements HomeView {

    private RecyclerView list;
    @Inject
    public Service service;
    ProgressBar progressBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getDeps().inject(this);

        renderView();
        init();

    }

    public  void renderView(){
        setContentView(R.layout.activity_home);
        list = (RecyclerView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
    }

    public void init(){
        list.setLayoutManager(new LinearLayoutManager(this));
    }


}

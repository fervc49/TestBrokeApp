package com.alexch49.weatherapp.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.alexch49.weatherapp.BaseApp;
import com.alexch49.weatherapp.R;
import com.alexch49.weatherapp.models.ZipWeatherResponse;
import com.alexch49.weatherapp.networking.Service;

import javax.inject.Inject;

public class HomeActivity extends BaseApp implements View.OnClickListener, HomeView{

    private RecyclerView list;
    HomePresenter presenter;
    RelativeLayout zipLayout;

    int zip_Code;
    @Inject
    public Service service;
    ProgressBar progressBar;
    Button zipBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDeps().inject(this);

        renderView();
        init();
        presenter = new HomePresenter(service, this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(zip_Code == 0){
            zipLayout.setVisibility(View.VISIBLE);
        } else {
            zipLayout.setVisibility(View.INVISIBLE);
            presenter.getWeatherList(zip_Code);
        }
    }

    public  void renderView(){
        setContentView(R.layout.activity_home);
        list = (RecyclerView) findViewById(R.id.list_recyclerview);
        zipBtn = (Button) findViewById(R.id.search_zip_btn);
        zipBtn.setOnClickListener(this);
        progressBar = (ProgressBar) findViewById(R.id.progress);
    }

    public void init(){
        list.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showWait() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void removeWait() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onFailure(String appErrorMessage) {

    }

    @Override
    public void getWeatherListSuccess(ZipWeatherResponse zipWeatherResponse) {
/*
        HomeAdapter adapter = new HomeAdapter(getApplicationContext(), cityListResponse.getData(),
                new HomeAdapter.OnItemClickListener() {
                    @Override
                    public void onClick(CityListData Item) {
                        Toast.makeText(getApplicationContext(), Item.getName(),
                                Toast.LENGTH_LONG).show();
                    }
                });

        list.setAdapter(adapter);
*/
    }

    @Override
    public void onClick(View v) {
        presenter.onClick(v.getId());
    }
}

package com.alexch49.weatherapp.home;

import android.view.View;

import com.alexch49.weatherapp.R;
import com.alexch49.weatherapp.models.ZipWeatherResponse;
import com.alexch49.weatherapp.networking.NetworkError;
import com.alexch49.weatherapp.networking.Service;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public class HomePresenter {
    private final Service service;
    private final HomeView view;
    private CompositeSubscription subscriptions;

    public HomePresenter(Service service, HomeView view) {
        this.service = service;
        this.view = view;
        this.subscriptions = new CompositeSubscription();
    }

    public void getWeatherList(int zipCode) {
        view.showWait();

        Subscription subscription = service.getHourlyTenDay(zipCode, new Service.ApiCallback<ZipWeatherResponse>() {
            @Override
            public void onSuccess(ZipWeatherResponse response) {
                view.removeWait();
                view.getWeatherListSuccess(response);
            }

            @Override
            public void onError(NetworkError networkError) {
                view.removeWait();
                view.onFailure(networkError.getAppErrorMessage());
            }
        });

        subscriptions.add(subscription);
    }

    public void onStop() {
        subscriptions.unsubscribe();
    }

    public void onClick(int id) {
        switch(id){
            case R.id.search_zip_btn:
                //view.launchShoppingCart();
                break;
        }
    }
}

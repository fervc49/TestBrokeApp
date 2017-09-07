package com.alexch49.weatherapp.home;

import com.alexch49.weatherapp.models.ZipWeatherResponse;

public interface HomeView {
    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getWeatherListSuccess(ZipWeatherResponse zipWeatherResponse);
}

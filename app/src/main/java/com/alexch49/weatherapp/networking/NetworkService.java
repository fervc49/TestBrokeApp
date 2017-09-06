package com.alexch49.weatherapp.networking;

import com.alexch49.weatherapp.models.ZipWeatherResponse;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface NetworkService {

    @GET("api/f744baa771bf75cd/hourly10day/q/{zip_code}.json")
    Observable<ZipWeatherResponse> getHourlyTenDay(@Path("zip_code") int zipCode);
    
}
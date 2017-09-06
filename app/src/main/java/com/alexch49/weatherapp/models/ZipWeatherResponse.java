package com.alexch49.weatherapp.models;

import com.alexch49.weatherapp.networking.BaseResponse;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ZipWeatherResponse extends BaseResponse {

    private Response response;
    @SerializedName("hourly_forecast")
    private List<HourlyForecast> hourlyForecast = null;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public List<HourlyForecast> getHourlyForecast() {
        return hourlyForecast;
    }

    public void setHourlyForecast(List<HourlyForecast> hourlyForecast) {
        this.hourlyForecast = hourlyForecast;
    }
}

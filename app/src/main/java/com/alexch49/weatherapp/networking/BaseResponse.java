package com.alexch49.weatherapp.networking;

import com.google.gson.Gson;

public abstract class BaseResponse {
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

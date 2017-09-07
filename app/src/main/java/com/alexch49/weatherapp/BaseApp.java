package com.alexch49.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alexch49.weatherapp.deps.DaggerDeps;
import com.alexch49.weatherapp.deps.Deps;
import com.alexch49.weatherapp.networking.NetworkModule;

public class BaseApp extends AppCompatActivity {

    Deps deps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        deps = DaggerDeps.builder().networkModule(new NetworkModule()).build();
    }

    public Deps getDeps() {
        return deps;
    }
}

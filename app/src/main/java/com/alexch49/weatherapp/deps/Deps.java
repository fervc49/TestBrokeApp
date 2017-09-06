package com.alexch49.weatherapp.deps;

import com.alexch49.weatherapp.home.HomeActivity;
import com.alexch49.weatherapp.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class,})
public interface Deps {
    //void inject();
}

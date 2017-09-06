package com.alexch49.weatherapp.networking;

import com.alexch49.weatherapp.models.ZipWeatherResponse;

import java.net.SocketTimeoutException;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class Service {
    private final NetworkService networkService;

    public Service(NetworkService networkService) {
        this.networkService = networkService;
    }

    public interface ApiCallback<R extends BaseResponse>{
        void onSuccess(R response);

        void onError(NetworkError networkError);
    }

    /**
     * Use to get the product information of amazon catalog base on a product id.
     */

    public Subscription getHourlyTenDay(int zipCode, final ApiCallback<ZipWeatherResponse> callback) {

        return networkService.getHourlyTenDay(zipCode)
               // .retry((retryCount, throwable) -> retryCount < 3 && throwable instanceof SocketTimeoutException)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onErrorResumeNext(new Func1<Throwable, Observable<ZipWeatherResponse>>() {
                    @Override
                    public Observable<ZipWeatherResponse> call(Throwable throwable) {
                        return Observable.error(throwable);
                    }
                })
                .subscribe(new Subscriber<ZipWeatherResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(new NetworkError(e));
                    }

                    @Override
                    public void onNext(ZipWeatherResponse zipWeatherResponse) {
                        callback.onSuccess(zipWeatherResponse);
                    }
                });
    }
}

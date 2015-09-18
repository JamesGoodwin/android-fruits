package com.jgoodwin.ustwo.arch.injection;

import com.jgoodwin.ustwo.activity.FruitsPresenter;
import com.jgoodwin.ustwo.activity.FruitsPresenterImpl;
import com.jgoodwin.ustwo.service.FruitApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

@Module
public class ViewModule {

    public static final String API_ENDPOINT = "http://private-e889-fruity.apiary-mock.com";

    @Provides
    public RestAdapter getRestAdapter() {
        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(API_ENDPOINT);

        return builder.build();
    }

    @Provides
    @Singleton
    public FruitApiService getFruitApiService(RestAdapter restAdapter) {
        return restAdapter.create(FruitApiService.class);
    }

    @Provides
    @Singleton
    public FruitsPresenter getFruitsPresenter(FruitApiService fruitApiService) {
        return new FruitsPresenterImpl(fruitApiService);
    }

}

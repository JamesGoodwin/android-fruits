package com.jgoodwin.ustwo.activity;

import com.jgoodwin.ustwo.domain.Fruit;
import com.jgoodwin.ustwo.service.FruitApiService;

import java.util.List;

import javax.inject.Inject;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class FruitsPresenterImpl implements FruitsPresenter {

    @Inject
    FruitApiService fruitApiService;

    public FruitsPresenterImpl(FruitApiService fruitApiService) {
        this.fruitApiService = fruitApiService;
    }

    @Override
    public void showFruits(final FruitsView view) {
        fruitApiService.get(new Callback<List<Fruit>>() {
            @Override
            public void success(List<Fruit> fruits, Response response) {
                view.showFruits(fruits);
            }

            @Override
            public void failure(RetrofitError error) {
                view.showError();
            }
        });
    }

}

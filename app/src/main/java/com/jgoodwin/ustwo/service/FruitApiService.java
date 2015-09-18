package com.jgoodwin.ustwo.service;

import com.jgoodwin.ustwo.domain.Fruit;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface FruitApiService {

    @GET("/fruits")
    void get(Callback<List<Fruit>> callback);

}
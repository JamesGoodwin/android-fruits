package com.jgoodwin.ustwo;

import java.util.List;

import retrofit.http.GET;

public interface FruitsApiService {

    @GET("/fruits")
    List<Fruit> get();

}

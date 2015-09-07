package com.jgoodwin.ustwo;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

import retrofit.RestAdapter;

public class FruitsLoader extends AsyncTaskLoader<List<Fruit>> {

    public FruitsLoader(Context context) {
        super(context);
    }

    @Override
    public List<Fruit> loadInBackground() {
        // with more time I would use dependency injection to provide
        // the FruitsApiService to the Loader, then verify with a unit test
        // that the ApiService is called and returns the data.

        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint("http://private-e889-fruity.apiary-mock.com");

        RestAdapter restAdapter = builder.build();

        FruitsApiService fruitsApiService = restAdapter.create(FruitsApiService.class);

        return fruitsApiService.get();
    }
}

package com.jgoodwin.fruitsapp;

import android.app.Application;

import com.jgoodwin.fruitsapp.arch.injection.ViewModule;
import com.jgoodwin.ustwo.arch.injection.DaggerViewComponent;
import com.jgoodwin.fruitsapp.arch.injection.ViewComponent;

public class FruitsApp extends Application {

    private static ViewComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerViewComponent.builder()
                .viewModule(new ViewModule())
                .build();
    }

    public static ViewComponent getComponent() {
        return component;
    }

}

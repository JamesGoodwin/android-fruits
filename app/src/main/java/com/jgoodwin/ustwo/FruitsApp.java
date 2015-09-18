package com.jgoodwin.ustwo;

import android.app.Application;

import com.jgoodwin.ustwo.arch.injection.DaggerViewComponent;
import com.jgoodwin.ustwo.arch.injection.ViewComponent;
import com.jgoodwin.ustwo.arch.injection.ViewModule;

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

package com.jgoodwin.fruitsapp.arch.injection;

import com.jgoodwin.fruitsapp.activity.FruitListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ViewModule.class)
public interface ViewComponent {

    void inject(FruitListFragment fragment);

}

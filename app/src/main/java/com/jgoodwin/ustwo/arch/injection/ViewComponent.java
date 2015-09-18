package com.jgoodwin.ustwo.arch.injection;

import com.jgoodwin.ustwo.activity.FruitListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ViewModule.class)
public interface ViewComponent {

    void inject(FruitListFragment fragment);

}

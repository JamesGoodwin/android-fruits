package com.jgoodwin.fruitsapp.activity;

import com.jgoodwin.fruitsapp.domain.Fruit;

import java.util.List;

public interface FruitsView {

    void showFruits(List<Fruit> fruits);

    void showError();
}

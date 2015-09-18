package com.jgoodwin.ustwo.activity;

import com.jgoodwin.ustwo.domain.Fruit;

import java.util.List;

public interface FruitsView {

    void showFruits(List<Fruit> fruits);

    void showError();
}

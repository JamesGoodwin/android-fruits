package com.jgoodwin.fruitsapp.activity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jgoodwin.ustwo.R;
import com.jgoodwin.fruitsapp.domain.Fruit;

import java.util.List;

public class FruitsAdapter extends RecyclerView.Adapter<FruitsViewHolder> {

    private List<Fruit> fruits;

    public FruitsAdapter(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    @Override
    public FruitsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());

        View view = layoutInflater.inflate(R.layout.list_fruit_item, viewGroup, false);

        return new FruitsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FruitsViewHolder fruitsViewHolder, int index) {
        Fruit fruit = fruits.get(index);

        fruitsViewHolder.setFruit(fruit);
    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }
}

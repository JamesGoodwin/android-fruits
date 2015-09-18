package com.jgoodwin.fruitsapp.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jgoodwin.fruitsapp.FruitsApp;
import com.jgoodwin.fruitsapp.domain.Fruit;
import com.jgoodwin.ustwo.R;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FruitListFragment extends Fragment implements FruitsView {

    @Bind(R.id.list)
    RecyclerView list;

    @Inject
    FruitsPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fruit_list, container, false);

        ButterKnife.bind(this, view);

        FruitsApp.getComponent().inject(this);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.showFruits(this);
    }

    @Override
    public void showFruits(List<Fruit> fruits) {
        FruitsAdapter adapter = new FruitsAdapter(fruits);
        list.setLayoutManager(new LinearLayoutManager(getActivity()));
        list.setAdapter(adapter);
    }

    @Override
    public void showError() {

    }

}

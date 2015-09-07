package com.jgoodwin.ustwo;

import android.app.Fragment;
import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FruitListFragment extends Fragment implements LoaderManager.LoaderCallbacks<List<Fruit>> {

    @Bind(R.id.list)
    RecyclerView list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fruit_list, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getLoaderManager().initLoader(this.getClass().hashCode(), null, this).forceLoad();
    }

    @Override
    public Loader<List<Fruit>> onCreateLoader(int i, Bundle bundle) {
        return new FruitsLoader(getActivity());
    }

    @Override
    public void onLoadFinished(Loader<List<Fruit>> loader, List<Fruit> fruits) {
        FruitsAdapter adapter = new FruitsAdapter(fruits);
        list.setLayoutManager(new LinearLayoutManager(getActivity()));
        list.setAdapter(adapter);
    }

    @Override
    public void onLoaderReset(Loader<List<Fruit>> loader) {

    }
}

package com.jgoodwin.fruitsapp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FruitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, new FruitListFragment())
                    .commit();
        }
    }

}

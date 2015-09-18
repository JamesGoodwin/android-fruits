package com.jgoodwin.ustwo.activity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jgoodwin.ustwo.R;
import com.jgoodwin.ustwo.domain.Fruit;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FruitsViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.icon_image)
    ImageView iconImage;

    @Bind(R.id.title_text)
    TextView titleText;

    @Bind(R.id.description_text)
    TextView description;

    public FruitsViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    public void setFruit(Fruit fruit) {
        titleText.setText(fruit.getName());

        description.setText(fruit.getDescription());

        Glide.with(iconImage.getContext())
                .load(fruit.getImageUrl())
                .into(iconImage);
    }
}

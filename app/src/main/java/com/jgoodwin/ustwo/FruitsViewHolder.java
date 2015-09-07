package com.jgoodwin.ustwo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

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

        Picasso.with(iconImage.getContext())
                .load(fruit.getImageUrl())
                .noFade()
                .into(iconImage);
    }
}

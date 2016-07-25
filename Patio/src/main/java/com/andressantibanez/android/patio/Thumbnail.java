package com.andressantibanez.android.patio;

import android.widget.ImageView;

public class Thumbnail {

    private String path;
    private ImageView imageView;

    public Thumbnail(String path, ImageView imageView) {
        this.path = path;
        this.imageView = imageView;
    }

    public String getPath() {
        return path;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setSelected(boolean selected) {
        getImageView().setSelected(selected);
        if (selected) {
            getImageView().setAlpha(0.5f);
        } else {
            getImageView().setAlpha(1.0f);
        }
    }

    public boolean isSelected() {
        return getImageView().isSelected();
    }
}

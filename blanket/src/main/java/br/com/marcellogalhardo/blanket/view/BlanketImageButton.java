package br.com.marcellogalhardo.blanket.view;

import android.widget.ImageButton;

public class BlanketImageButton extends BlanketImageView {

    private final ImageButton imageButton;

    public BlanketImageButton(ImageButton imageButton) {
        super(imageButton);
        this.imageButton = imageButton;
    }

    @Override
    public ImageButton reference() {
        return imageButton;
    }

}

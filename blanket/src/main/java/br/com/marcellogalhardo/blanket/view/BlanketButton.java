package br.com.marcellogalhardo.blanket.view;

import android.widget.Button;

public class BlanketButton extends BlanketTextView {

    private final Button button;

    public BlanketButton(Button button) {
        super(button);
        this.button = button;
    }

    @Override
    public Button reference() {
        return button;
    }

}

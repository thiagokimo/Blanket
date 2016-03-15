package br.com.marcellogalhardo.blanket.view;

import android.widget.RadioButton;

public class BlanketRadioButton extends BlanketCompoundButton {

    private final RadioButton radioButton;

    public BlanketRadioButton(RadioButton radioButton) {
        super(radioButton);
        this.radioButton = radioButton;
    }

    @Override
    public RadioButton reference() {
        return radioButton;
    }

}

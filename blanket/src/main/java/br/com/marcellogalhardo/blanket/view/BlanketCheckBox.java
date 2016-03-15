package br.com.marcellogalhardo.blanket.view;

import android.widget.CheckBox;

public class BlanketCheckBox extends BlanketCompoundButton {

    private final CheckBox checkBox;

    public BlanketCheckBox(CheckBox checkBox) {
        super(checkBox);
        this.checkBox = checkBox;
    }

    @Override
    public CheckBox reference() {
        return checkBox;
    }

}

package br.com.marcellogalhardo.blanket.view;

import android.graphics.drawable.Drawable;
import android.widget.ToggleButton;

public class BlanketToggleButton extends BlanketCompoundButton {

    private final ToggleButton toggleButton;

    public BlanketToggleButton(ToggleButton toggleButton) {
        super(toggleButton);
        this.toggleButton = toggleButton;
    }

    @Override
    public ToggleButton reference() {
        return toggleButton;
    }

    @Deprecated
    public BlanketToggleButton backgroundDrawable(Drawable d) {
        toggleButton.setBackgroundDrawable(d);
        return this;
    }

    public BlanketToggleButton checked(boolean checked) {
        toggleButton.setChecked(checked);
        return this;
    }

    public BlanketToggleButton textOff(CharSequence textOff) {
        toggleButton.setTextOff(textOff);
        return this;
    }

    public BlanketToggleButton textOn(CharSequence textOn) {
        toggleButton.setTextOn(textOn);
        return this;
    }
}

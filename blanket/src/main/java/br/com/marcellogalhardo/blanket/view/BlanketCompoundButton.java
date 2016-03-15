package br.com.marcellogalhardo.blanket.view;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.widget.CompoundButton;

public class BlanketCompoundButton extends BlanketButton {

    private CompoundButton compoundButton;

    public BlanketCompoundButton(CompoundButton compoundButton) {
        super(compoundButton);
        this.compoundButton = compoundButton;
    }

    @Override
    public CompoundButton reference() {
        return compoundButton;
    }

    @Nullable
    public BlanketCompoundButton buttonDrawable(Drawable drawable) {
        compoundButton.setButtonDrawable(drawable);
        return this;
    }

    public BlanketCompoundButton buttonDrawable(int resId) {
        compoundButton.setButtonDrawable(resId);
        return this;
    }

    @TargetApi(21)
    public BlanketCompoundButton buttonTintList(ColorStateList tint) {
        compoundButton.setButtonTintList(tint);
        return this;
    }

    @TargetApi(21)
    public BlanketCompoundButton buttonTintMode(PorterDuff.Mode tintMode) {
        compoundButton.setButtonTintMode(tintMode);
        return this;
    }

    public BlanketCompoundButton checked(boolean checked) {
        compoundButton.setChecked(checked);
        return this;
    }

    public BlanketCompoundButton onCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        compoundButton.setOnCheckedChangeListener(listener);
        return this;
    }

    public BlanketCompoundButton toggle() {
        compoundButton.toggle();
        return this;
    }
}

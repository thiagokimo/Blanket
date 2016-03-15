package br.com.marcellogalhardo.blanket.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.Switch;

public class BlanketSwitch extends BlanketCompoundButton {

    private final Switch switchView;

    public BlanketSwitch(Switch switchView) {
        super(switchView);
        this.switchView = switchView;
    }

    @Override
    public Switch reference() {
        return switchView;
    }

    public BlanketSwitch checked(boolean checked) {
        switchView.setChecked(checked);
        return this;
    }

    @TargetApi(21)
    public BlanketSwitch showText(boolean showText) {
        switchView.setShowText(showText);
        return this;
    }

    @TargetApi(21)
    public BlanketSwitch splitTrack(boolean splitTrack) {
        switchView.setSplitTrack(splitTrack);
        return this;
    }

    @TargetApi(16)
    public BlanketSwitch switchMinWidth(int pixels) {
        switchView.setSwitchMinWidth(pixels);
        return this;
    }

    @TargetApi(16)
    public BlanketSwitch switchPadding(int pixels) {
        switchView.setSwitchPadding(pixels);
        return this;
    }

    public BlanketSwitch switchTextAppearance(Context context, int resid) {
        switchView.setSwitchTextAppearance(context, resid);
        return this;
    }

    public BlanketSwitch switchTypeface(Typeface tf) {
        switchView.setSwitchTypeface(tf);
        return this;
    }

    public BlanketSwitch switchTypeface(Typeface tf, int style) {
        switchView.setSwitchTypeface(tf, style);
        return this;
    }

    public BlanketSwitch textOff(CharSequence textOff) {
        switchView.setTextOff(textOff);
        return this;
    }

    public BlanketSwitch textOn(CharSequence textOn) {
        switchView.setTextOn(textOn);
        return this;
    }

    @TargetApi(16)
    public BlanketSwitch thumbDrawable(Drawable thumb) {
        switchView.setThumbDrawable(thumb);
        return this;
    }

    @TargetApi(16)
    public BlanketSwitch thumbResource(int resId) {
        switchView.setThumbResource(resId);
        return this;
    }

    @TargetApi(16)
    public BlanketSwitch thumbTextPadding(int pixels) {
        switchView.setThumbTextPadding(pixels);
        return this;
    }

    @TargetApi(23)
    public BlanketSwitch thumbTintList(ColorStateList tint) {
        switchView.setThumbTintList(tint);
        return this;
    }

    @TargetApi(23)
    public BlanketSwitch thumbTintMode(PorterDuff.Mode tintMode) {
        switchView.setThumbTintMode(tintMode);
        return this;
    }

    @TargetApi(16)
    public BlanketSwitch trackDrawable(Drawable track) {
        switchView.setTrackDrawable(track);
        return this;
    }

    @TargetApi(16)
    public BlanketSwitch trackResource(int resId) {
        switchView.setTrackResource(resId);
        return this;
    }

    @TargetApi(23)
    public BlanketSwitch trackTintList(ColorStateList tint) {
        switchView.setTrackTintList(tint);
        return this;
    }

    @TargetApi(23)
    public BlanketSwitch trackTintMode(PorterDuff.Mode tintMode) {
        switchView.setTrackTintMode(tintMode);
        return this;
    }
}

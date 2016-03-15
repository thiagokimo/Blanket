package br.com.marcellogalhardo.blanket.view;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

public class BlanketSeekBar extends BlanketProgressBar {

    private final SeekBar seekBar;

    public BlanketSeekBar(SeekBar seekBar) {
        super(seekBar);
        this.seekBar = seekBar;
    }

    @Override
    public SeekBar reference() {
        return seekBar;
    }

    public BlanketSeekBar setKeyProgressIncrement(int increment) {
        seekBar.setKeyProgressIncrement(increment);
        return this;
    }

    public synchronized BlanketSeekBar max(int max) {
        seekBar.setMax(max);
        return this;
    }

    @TargetApi(21)
    public BlanketSeekBar splitTrack(boolean splitTrack) {
        seekBar.setSplitTrack(splitTrack);
        return this;
    }

    public BlanketSeekBar thumb(Drawable thumb) {
        seekBar.setThumb(thumb);
        return this;
    }

    public BlanketSeekBar thumbOffset(int thumbOffset) {
        seekBar.setThumbOffset(thumbOffset);
        return this;
    }

    @TargetApi(21)
    public BlanketSeekBar thumbTintList(ColorStateList tint) {
        seekBar.setThumbTintList(tint);
        return this;
    }

    @TargetApi(21)
    public BlanketSeekBar thumbTintMode(PorterDuff.Mode tintMode) {
        seekBar.setThumbTintMode(tintMode);
        return this;
    }
}

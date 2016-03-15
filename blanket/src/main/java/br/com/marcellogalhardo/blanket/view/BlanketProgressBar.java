package br.com.marcellogalhardo.blanket.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

public class BlanketProgressBar extends BlanketView {

    private final ProgressBar progressBar;

    public BlanketProgressBar(ProgressBar progressBar) {
        super(progressBar);
        this.progressBar = progressBar;
    }

    public ProgressBar reference() {
        return progressBar;
    }

    public synchronized BlanketProgressBar indeterminate(boolean indeterminate) {
        progressBar.setIndeterminate(indeterminate);
        return this;
    }

    public BlanketProgressBar indeterminateDrawable(Drawable d) {
        progressBar.setIndeterminateDrawable(d);
        return this;
    }

    @TargetApi(21)
    public BlanketProgressBar indeterminateDrawableTiled(Drawable d) {
        progressBar.setIndeterminateDrawableTiled(d);
        return this;
    }

    @TargetApi(21)
    public BlanketProgressBar indeterminateTintList(ColorStateList tint) {
        progressBar.setIndeterminateTintList(tint);
        return this;
    }

    @TargetApi(21)
    public BlanketProgressBar indeterminateTintMode(PorterDuff.Mode tintMode) {
        progressBar.setIndeterminateTintMode(tintMode);
        return this;
    }

    public BlanketProgressBar interpolator(Context context, int resID) {
        progressBar.setInterpolator(context, resID);
        return this;
    }

    public BlanketProgressBar interpolator(Interpolator interpolator) {
        progressBar.setInterpolator(interpolator);
        return this;
    }

    public synchronized BlanketProgressBar max(int max) {
        progressBar.setMax(max);
        return this;
    }

    public synchronized BlanketProgressBar progress(int progress) {
        progressBar.setProgress(progress);
        return this;
    }

    @TargetApi(21)
    public BlanketProgressBar progressBackgroundTintList(ColorStateList tint) {
        progressBar.setProgressBackgroundTintList(tint);
        return this;
    }

    @TargetApi(21)
    public BlanketProgressBar progressBackgroundTintMode(PorterDuff.Mode tintMode) {
        progressBar.setProgressBackgroundTintMode(tintMode);
        return this;
    }

    public BlanketProgressBar progressDrawable(Drawable d) {
        progressBar.setProgressDrawable(d);
        return this;
    }

    @TargetApi(21)
    public BlanketProgressBar progressDrawableTiled(Drawable d) {
        progressBar.setProgressDrawableTiled(d);
        return this;
    }

    @TargetApi(21)
    public BlanketProgressBar progressTintList(ColorStateList tint) {
        progressBar.setProgressTintList(tint);
        return this;
    }

    @TargetApi(21)
    public BlanketProgressBar progressTintMode(PorterDuff.Mode tintMode) {
        progressBar.setProgressTintMode(tintMode);
        return this;
    }

    public synchronized BlanketProgressBar secondaryProgress(int secondaryProgress) {
        progressBar.setSecondaryProgress(secondaryProgress);
        return this;
    }

    @TargetApi(21)
    public BlanketProgressBar secondaryProgressTintList(ColorStateList tint) {
        progressBar.setSecondaryProgressTintList(tint);
        return this;
    }

    @TargetApi(21)
    public BlanketProgressBar secondaryProgressTintMode(PorterDuff.Mode tintMode) {
        progressBar.setSecondaryProgressTintMode(tintMode);
        return this;
    }

    public BlanketProgressBar visibility(int v) {
        progressBar.setVisibility(v);
        return this;
    }

}

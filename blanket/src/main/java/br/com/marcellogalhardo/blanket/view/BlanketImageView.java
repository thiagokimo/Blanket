package br.com.marcellogalhardo.blanket.view;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.widget.ImageView;

public class BlanketImageView extends BlanketView {

    private final ImageView imageView;

    public BlanketImageView(ImageView imageView) {
        super(imageView);
        this.imageView = imageView;
    }

    public BlanketImageView setAdjustViewBounds(boolean adjustViewBounds) {
        imageView.setAdjustViewBounds(adjustViewBounds);
        return this;
    }

    public ImageView reference() {
        return imageView;
    }

    @Deprecated
    public BlanketImageView alpha(int alpha) {
        imageView.setAlpha(alpha);
        return this;
    }

    public BlanketImageView baseline(int baseline) {
        imageView.setBaseline(baseline);
        return this;
    }

    public BlanketImageView baselineAlignBottom(boolean aligned) {
        imageView.setBaselineAlignBottom(aligned);
        return this;
    }

    public BlanketImageView colorFilter(ColorFilter cf) {
        imageView.setColorFilter(cf);
        return this;
    }

    @TargetApi(16)
    public BlanketImageView cropToPadding(boolean cropToPadding) {
        imageView.setCropToPadding(cropToPadding);
        return this;
    }

    @TargetApi(16)
    public BlanketImageView imageAlpha(int alpha) {
        imageView.setImageAlpha(alpha);
        return this;
    }

    public BlanketImageView imageBitmap(Bitmap bm) {
        imageView.setImageBitmap(bm);
        return this;
    }

    public BlanketImageView imageDrawable(Drawable drawable) {
        imageView.setImageDrawable(drawable);
        return this;
    }

    @TargetApi(23)
    public BlanketImageView imageIcon(Icon icon) {
        imageView.setImageIcon(icon);
        return this;
    }

    public BlanketImageView imageLevel(int level) {
        imageView.setImageLevel(level);
        return this;
    }
    
    public BlanketImageView imageMatrix(Matrix matrix) {
        imageView.setImageMatrix(matrix);
        return this;
    }
    
    public BlanketImageView imageResource(int resId) {
        imageView.setImageResource(resId);
        return this;
    }
    
    public BlanketImageView imageState(int[] state, boolean merge) {
        imageView.setImageState(state, merge);
        return this;
    }

    @TargetApi(21)
    public BlanketImageView imageTintList(ColorStateList tint) {
        imageView.setImageTintList(tint);
        return this;
    }

    @TargetApi(21)
    public BlanketImageView imageTintMode(PorterDuff.Mode tintMode) {
        imageView.setImageTintMode(tintMode);
        return this;
    }

    public BlanketImageView imageURI(Uri uri) {
        imageView.setImageURI(uri);
        return this;
    }

    public BlanketImageView maxHeight(int maxHeight) {
        imageView.setMaxHeight(maxHeight);
        return this;
    }

    public BlanketImageView maxWidth(int maxWidth) {
        imageView.setMaxWidth(maxWidth);
        return this;
    }

    public BlanketImageView scaleType(ImageView.ScaleType scaleType) {
        imageView.setScaleType(scaleType);
        return this;
    }

    public BlanketImageView selected(boolean selected) {
        imageView.setSelected(selected);
        return this;
    }

    public BlanketImageView visibility(int visibility) {
        imageView.setVisibility(visibility);
        return this;
    }
}

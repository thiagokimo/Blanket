package br.com.marcellogalhardo.blanket.view;

import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;

public class BlanketView {

    private View view;

    public BlanketView(View view) {
        this.view = view;
    }

    public View reference() {
        return view;
    }

    public BlanketView accessibilityDelegate(View.AccessibilityDelegate delegate) {
        view.setAccessibilityDelegate(delegate);
        return this;
    }

    @TargetApi(19)
    public BlanketView accessibilityLiveRegion(int mode) {
        view.setAccessibilityLiveRegion(mode);
        return this;
    }

    @TargetApi(22)
    public BlanketView accessibilityTraversalAfter(int afterId) {
        view.setAccessibilityTraversalAfter(afterId);
        return this;
    }

    @TargetApi(22)
    public BlanketView accessibilityTraversalBefore(int beforeId) {
        view.setAccessibilityTraversalBefore(beforeId);
        return this;
    }

    public BlanketView activated(boolean activated) {
        view.setActivated(activated);
        return this;
    }

    public BlanketView alpha(float alpha) {
        view.setAlpha(alpha);
        return this;
    }

    public BlanketView animation(Animation animation) {
        view.setAnimation(animation);
        return this;
    }

    @TargetApi(16)
    public BlanketView background(Drawable background) {
        view.setBackground(background);
        return this;
    }

    public BlanketView backgroundColor(int color) {
        view.setBackgroundColor(color);
        return this;
    }

    @Deprecated
    public BlanketView backgroundDrawable(Drawable background) {
        view.setBackgroundDrawable(background);
        return this;
    }

    public BlanketView backgroundResource(int resid) {
        view.setBackgroundResource(resid);
        return this;
    }

    @TargetApi(21)
    public BlanketView backgroundTintList(ColorStateList tint) {
        view.setBackgroundTintList(tint);
        return this;
    }

    @TargetApi(21)
    public BlanketView backgroundTintMode(PorterDuff.Mode tintMode) {
        view.setBackgroundTintMode(tintMode);
        return this;
    }

    public BlanketView cameraDistance(float distance) {
        view.setCameraDistance(distance);
        return this;
    }

    public BlanketView clickable(boolean clickable) {
        view.setClickable(clickable);
        return this;
    }

    @TargetApi(18)
    public BlanketView clipBounds(Rect clipBounds) {
        view.setClipBounds(clipBounds);
        return this;
    }

    @TargetApi(21)
    public BlanketView clipToOutline(boolean clipToOutline) {
        view.setClipToOutline(clipToOutline);
        return this;
    }

    public BlanketView contentDescription(CharSequence contentDescription) {
        view.setContentDescription(contentDescription);
        return this;
    }

    @TargetApi(23)
    public BlanketView contextClickable(boolean contextClickable) {
        view.setContextClickable(contextClickable);
        return this;
    }

    public BlanketView drawingCacheBackgroundColor(int color) {
        view.setDrawingCacheBackgroundColor(color);
        return this;
    }

    public BlanketView setDrawingCacheEnabled(boolean enabled) {
        view.setDrawingCacheEnabled(enabled);
        return this;
    }

    public BlanketView setDrawingCacheQuality(int quality) {
        view.setDrawingCacheQuality(quality);
        return this;
    }

    public BlanketView duplicateParentStateEnabled(boolean enabled) {
        view.setDuplicateParentStateEnabled(enabled);
        return this;
    }

    @TargetApi(21)
    public BlanketView elevation(float elevation) {
        view.setElevation(elevation);
        return this;
    }

    public BlanketView enabled(boolean enabled) {
        view.setEnabled(enabled);
        return this;
    }

    public BlanketView fadingEdgeLength(int length) {
        view.setFadingEdgeLength(length);
        return this;
    }

    public BlanketView filterTouchesWhenObscured(boolean enabled) {
        view.setFilterTouchesWhenObscured(enabled);
        return this;
    }

    public BlanketView fitsSystemWindows(boolean fitSystemWindows) {
        view.setFitsSystemWindows(fitSystemWindows);
        return this;
    }

    public BlanketView focusable(boolean focusable) {
        view.setFocusable(focusable);
        return this;
    }

    public BlanketView focusableInTouchMode(boolean focusableInTouchMode) {
        view.setFocusableInTouchMode(focusableInTouchMode);
        return this;
    }

    @TargetApi(23)
    public BlanketView foreground(Drawable foreground) {
        view.setForeground(foreground);
        return this;
    }

    @TargetApi(23)
    public BlanketView foregroundGravity(int gravity) {
        view.setForegroundGravity(gravity);
        return this;
    }

    @TargetApi(23)
    public BlanketView foregroundTintList(ColorStateList tint) {
        view.setForegroundTintList(tint);
        return this;
    }

    @TargetApi(23)
    public BlanketView foregroundTintMode(PorterDuff.Mode tintMode) {
        view.setForegroundTintMode(tintMode);
        return this;
    }

    public BlanketView hapticFeedbackEnabled(boolean hapticFeedbackEnabled) {
        view.setHapticFeedbackEnabled(hapticFeedbackEnabled);
        return this;
    }

    @TargetApi(16)
    public BlanketView hasTransientState(boolean hasTransientState) {
        view.setHasTransientState(hasTransientState);
        return this;
    }

    public BlanketView horizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) {
        view.setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled);
        return this;
    }

    public BlanketView horizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) {
        view.setHorizontalScrollBarEnabled(horizontalScrollBarEnabled);
        return this;
    }

    public BlanketView hovered(boolean hovered) {
        view.setHovered(hovered);
        return this;
    }

    public BlanketView id(int id) {
        view.setId(id);
        return this;
    }

    @TargetApi(16)
    public BlanketView importantForAccessibility(int mode) {
        view.setImportantForAccessibility(mode);
        return this;
    }

    public BlanketView keepScreenOn(boolean keepScreenOn) {
        view.setKeepScreenOn(keepScreenOn);
        return this;
    }

    @TargetApi(17)
    public BlanketView labelFor(int id) {
        view.setLabelFor(id);
        return this;
    }

    @TargetApi(17)
    public BlanketView layerPaint(Paint paint) {
        view.setLayerPaint(paint);
        return this;
    }

    public BlanketView layerType(int layerType, Paint paint) {
        view.setLayerType(layerType, paint);
        return this;
    }

    @TargetApi(17)
    public BlanketView layoutDirection(int layoutDirection) {
        view.setLayoutDirection(layoutDirection);
        return this;
    }

    public BlanketView layoutParams(ViewGroup.LayoutParams params) {
        view.setLayoutParams(params);
        return this;
    }

    public BlanketView longClickable(boolean longClickable) {
        view.setLongClickable(longClickable);
        return this;
    }

    public BlanketView minimumHeight(int minHeight) {
        view.setMinimumHeight(minHeight);
        return this;
    }

    public BlanketView minimumWidth(int minWidth) {
        view.setMinimumWidth(minWidth);
        return this;
    }

    @TargetApi(21)
    public BlanketView nestedScrollingEnabled(boolean enabled) {
        view.setNestedScrollingEnabled(enabled);
        return this;
    }

    public BlanketView nextFocusDownId(int nextFocusDownId) {
        view.setNextFocusDownId(nextFocusDownId);
        return this;
    }

    public BlanketView nextFocusForwardId(int nextFocusForwardId) {
        view.setNextFocusForwardId(nextFocusForwardId);
        return this;
    }

    public BlanketView nextFocusLeftId(int nextFocusLeftId) {
        view.setNextFocusLeftId(nextFocusLeftId);
        return this;
    }

    public BlanketView nextFocusRightId(int nextFocusRightId) {
        view.setNextFocusRightId(nextFocusRightId);
        return this;
    }

    public BlanketView nextFocusUpId(int nextFocusUpId) {
        view.setNextFocusUpId(nextFocusUpId);
        return this;
    }

    @TargetApi(20)
    public BlanketView onApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        view.setOnApplyWindowInsetsListener(listener);
        return this;
    }

    public BlanketView onClickListener(View.OnClickListener l) {
        view.setOnClickListener(l);
        return this;
    }

    @TargetApi(23)
    public BlanketView onContextClickListener(View.OnContextClickListener l) {
        view.setOnContextClickListener(l);
        return this;
    }

    public BlanketView onCreateContextMenuListener(View.OnCreateContextMenuListener l) {
        view.setOnCreateContextMenuListener(l);
        return this;
    }

    public BlanketView onDragListener(View.OnDragListener l) {
        view.setOnDragListener(l);
        return this;
    }

    public BlanketView onFocusChangeListener(View.OnFocusChangeListener l) {
        view.setOnFocusChangeListener(l);
        return this;
    }

    public BlanketView onGenericMotionListener(View.OnGenericMotionListener l) {
        view.setOnGenericMotionListener(l);
        return this;
    }

    public BlanketView onHoverListener(View.OnHoverListener l) {
        view.setOnHoverListener(l);
        return this;
    }

    public BlanketView onKeyListener(View.OnKeyListener l) {
        view.setOnKeyListener(l);
        return this;
    }

    public BlanketView onLongClickListener(View.OnLongClickListener l) {
        view.setOnLongClickListener(l);
        return this;
    }

    @TargetApi(23)
    public BlanketView onScrollChangeListener(View.OnScrollChangeListener l) {
        view.setOnScrollChangeListener(l);
        return this;
    }

    public BlanketView onSystemUiVisibilityChangeListener(View.OnSystemUiVisibilityChangeListener l) {
        view.setOnSystemUiVisibilityChangeListener(l);
        return this;
    }

    public BlanketView onTouchListener(View.OnTouchListener l) {
        view.setOnTouchListener(l);
        return this;
    }

    @TargetApi(21)
    public BlanketView outlineProvider(ViewOutlineProvider provider) {
        view.setOutlineProvider(provider);
        return this;
    }

    public BlanketView overScrollMode(int overScrollMode) {
        view.setOverScrollMode(overScrollMode);
        return this;
    }

    public BlanketView padding(int left, int top, int right, int bottom) {
        view.setPadding(left, top, right, bottom);
        return this;
    }

    @TargetApi(17)
    public BlanketView paddingRelative(int start, int top, int end, int bottom) {
        view.setPaddingRelative(start, top, end, bottom);
        return this;
    }

    public BlanketView pivotX(float pivotX) {
        view.setPivotX(pivotX);
        return this;
    }

    public BlanketView pivotY(float pivotY) {
        view.setPivotY(pivotY);
        return this;
    }

    public BlanketView pressed(boolean pressed) {
        view.setPressed(pressed);
        return this;
    }

    public BlanketView rotation(float rotation) {
        view.setRotation(rotation);
        return this;
    }

    public BlanketView rotationX(float rotationX) {
        view.setRotationX(rotationX);
        return this;
    }

    public BlanketView rotationY(float rotationY) {
        view.setRotationY(rotationY);
        return this;
    }

    public BlanketView saveEnabled(boolean enabled) {
        view.setSaveEnabled(enabled);
        return this;
    }

    public BlanketView saveFromParentEnabled(boolean enabled) {
        view.setSaveFromParentEnabled(enabled);
        return this;
    }

    public BlanketView scaleX(float scaleX) {
        view.setScaleX(scaleX);
        return this;
    }

    public BlanketView scaleY(float scaleY) {
        view.setScaleY(scaleY);
        return this;
    }

    @TargetApi(16)
    public BlanketView scrollBarDefaultDelayBeforeFade(int scrollBarDefaultDelayBeforeFade) {
        view.setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade);
        return this;
    }

    @TargetApi(16)
    public BlanketView scrollBarFadeDuration(int scrollBarFadeDuration) {
        view.setScrollBarFadeDuration(scrollBarFadeDuration);
        return this;
    }

    public BlanketView scrollbarFadingEnabled(boolean fadeScrollbars) {
        view.setScrollbarFadingEnabled(fadeScrollbars);
        return this;
    }

    @TargetApi(16)
    public BlanketView scrollBarSize(int scrollBarSize) {
        view.setScrollBarSize(scrollBarSize);
        return this;
    }

    public BlanketView scrollBarStyle(int style) {
        view.setScrollBarStyle(style);
        return this;
    }

    public BlanketView scrollContainer(boolean isScrollContainer) {
        view.setScrollContainer(isScrollContainer);
        return this;
    }

    @TargetApi(23)
    public BlanketView scrollIndicators(int indicators) {
        view.setScrollIndicators(indicators);
        return this;
    }

    @TargetApi(23)
    public BlanketView scrollIndicators(int indicators, int mask) {
        view.setScrollIndicators(indicators, mask);
        return this;
    }

    public BlanketView scrollX(int value) {
        view.setScrollX(value);
        return this;
    }

    public BlanketView scrollY(int value) {
        view.setScrollY(value);
        return this;
    }

    public BlanketView selected(boolean selected) {
        view.setSelected(selected);
        return this;
    }

    public BlanketView soundEffectsEnabled(boolean soundEffectsEnabled) {
        view.setSoundEffectsEnabled(soundEffectsEnabled);
        return this;
    }

    @TargetApi(21)
    public BlanketView stateListAnimator(StateListAnimator stateListAnimator) {
        view.setStateListAnimator(stateListAnimator);
        return this;
    }

    public BlanketView systemUiVisibility(int visibility) {
        view.setSystemUiVisibility(visibility);
        return this;
    }

    public BlanketView tag(int key, Object tag) {
        view.setTag(key, tag);
        return this;
    }

    public BlanketView tag(Object tag) {
        view.setTag(tag);
        return this;
    }

    @TargetApi(17)
    public BlanketView textAlignment(int textAlignment) {
        view.setTextAlignment(textAlignment);
        return this;
    }

    @TargetApi(17)
    public BlanketView textDirection(int textDirection) {
        view.setTextDirection(textDirection);
        return this;
    }

    public BlanketView touchDelegate(TouchDelegate delegate) {
        view.setTouchDelegate(delegate);
        return this;
    }

    public BlanketView translationX(float translationX) {
        view.setTranslationX(translationX);
        return this;
    }

    public BlanketView translationY(float translationY) {
        view.setTranslationY(translationY);
        return this;
    }

    @TargetApi(21)
    public BlanketView translationZ(float translationZ) {
        view.setTranslationZ(translationZ);
        return this;
    }

    public BlanketView verticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) {
        view.setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled);
        return this;
    }

    public BlanketView verticalScrollBarEnabled(boolean verticalScrollBarEnabled) {
        view.setVerticalScrollBarEnabled(verticalScrollBarEnabled);
        return this;
    }

    public BlanketView verticalScrollbarPosition(int position) {
        view.setVerticalScrollbarPosition(position);
        return this;
    }

    public BlanketView visibility(int visibility) {
        view.setVisibility(visibility);
        return this;
    }

    public BlanketView willNotCacheDrawing(boolean willNotCacheDrawing) {
        view.setWillNotCacheDrawing(willNotCacheDrawing);
        return this;
    }

    public BlanketView willNotDraw(boolean willNotDraw) {
        view.setWillNotDraw(willNotDraw);
        return this;
    }

    public BlanketView x(float x) {
        view.setX(x);
        return this;
    }

    public BlanketView y(float y) {
        view.setY(y);
        return this;
    }

    @TargetApi(21)
    public BlanketView z(float z) {
        view.setZ(z);
        return this;
    }

}

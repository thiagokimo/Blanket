package br.com.marcellogalhardo.blanket.view;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.StringRes;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.ActionMode;
import android.view.inputmethod.ExtractedText;
import android.widget.Scroller;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.Locale;

public class BlanketTextView extends BlanketView {

    private final TextView textView;

    public BlanketTextView(TextView textView) {
        super(textView);
        this.textView = textView;
    }

    public BlanketTextView enabled(boolean enabled) {
        textView.setEnabled(enabled);
        return this;
    }

    public TextView reference() {
        return textView;
    }

    public BlanketTextView typeface(Typeface tf, int style) {
        textView.setTypeface(tf, style);
        return this;
    }

    public BlanketTextView compoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        textView.setCompoundDrawables(left, top, right, bottom);
        return this;
    }

    public BlanketTextView compoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        textView.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        return this;
    }

    public BlanketTextView compoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        textView.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        return this;
    }

    @TargetApi(17)
    public BlanketTextView compoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        textView.setCompoundDrawablesRelative(start, top, end, bottom);
        return this;
    }

    @TargetApi(17)
    public BlanketTextView compoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        return this;
    }

    @TargetApi(17)
    public BlanketTextView compoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        return this;
    }

    public BlanketTextView compoundDrawablePadding(int pad) {
        textView.setCompoundDrawablePadding(pad);
        return this;
    }

    @TargetApi(23)
    public BlanketTextView compoundDrawableTintList(ColorStateList tint) {
        textView.setCompoundDrawableTintList(tint);
        return this;
    }

    @TargetApi(23)
    public BlanketTextView compoundDrawableTintMode(PorterDuff.Mode tintMode) {
        textView.setCompoundDrawableTintMode(tintMode);
        return this;
    }

    public BlanketTextView padding(int left, int top, int right, int bottom) {
        textView.setPadding(left, top, right, bottom);
        return this;
    }

    @TargetApi(16)
    public BlanketTextView paddingRelative(int start, int top, int end, int bottom) {
        textView.setPaddingRelative(start, top, end, bottom);
        return this;
    }

    @TargetApi(23)
    public BlanketTextView textAppearance(int resId) {
        textView.setTextAppearance(resId);
        return this;
    }

    @TargetApi(17)
    public BlanketTextView textLocale(Locale locale) {
        textView.setTextLocale(locale);
        return this;
    }

    public BlanketTextView textSize(float size) {
        textView.setTextSize(size);
        return this;
    }

    public BlanketTextView textSize(int unit, float size) {
        textView.setTextSize(unit, size);
        return this;
    }

    public BlanketTextView textScaleX(float size) {
        textView.setTextScaleX(size);
        return this;
    }

    public BlanketTextView typeface(Typeface tf) {
        textView.setTypeface(tf);
        return this;
    }

    @TargetApi(21)
    public BlanketTextView elegantTextHeight(boolean elegant) {
        textView.setElegantTextHeight(elegant);
        return this;
    }

    @TargetApi(21)
    public BlanketTextView letterSpacing(float letterSpacing) {
        textView.setLetterSpacing(letterSpacing);
        return this;
    }

    @TargetApi(23)
    public BlanketTextView breakStrategy(int breakStrategy) {
        textView.setBreakStrategy(breakStrategy);
        return this;
    }

    @TargetApi(23)
    public BlanketTextView hyphenationFrequency(int hyphenationFrequency) {
        textView.setHyphenationFrequency(hyphenationFrequency);
        return this;
    }

    @TargetApi(21)
    public BlanketTextView fontFeatureSettings(String fontFeatureSettings) {
        textView.setFontFeatureSettings(fontFeatureSettings);
        return this;
    }

    public BlanketTextView textColor(int color) {
        textView.setTextColor(color);
        return this;
    }

    public BlanketTextView textColor(ColorStateList colors) {
        textView.setTextColor(colors);
        return this;
    }

    public BlanketTextView highlightColor(int color) {
        textView.setHighlightColor(color);
        return this;
    }

    public BlanketTextView shadowLayer(float radius, float dx, float dy, int color) {
        textView.setShadowLayer(radius, dx, dy, color);
        return this;
    }

    public BlanketTextView gravity(int gravity) {
        textView.setGravity(gravity);
        return this;
    }

    public BlanketTextView paintFlags(int flags) {
        textView.setPaintFlags(flags);
        return this;
    }

    public BlanketTextView horizontallyScrolling(boolean whether) {
        textView.setHorizontallyScrolling(whether);
        return this;
    }

    public BlanketTextView minLines(int minlines) {
        textView.setMinLines(minlines);
        return this;
    }

    public BlanketTextView minHeight(int minHeight) {
        textView.setMinHeight(minHeight);
        return this;
    }

    public BlanketTextView maxLines(int maxlines) {
        textView.setMaxLines(maxlines);
        return this;
    }

    public BlanketTextView maxHeight(int maxHeight) {
        textView.setMaxHeight(maxHeight);
        return this;
    }

    public BlanketTextView lines(int lines) {
        textView.setLines(lines);
        return this;
    }


    public BlanketTextView height(int pixels) {
        textView.setHeight(pixels);
        return this;
    }


    public BlanketTextView minEms(int minems) {
        textView.setMinEms(minems);
        return this;
    }


    public BlanketTextView minWidth(int minpixels) {
        textView.setMinWidth(minpixels);
        return this;
    }


    public BlanketTextView maxEms(int maxems) {
        textView.setMaxEms(maxems);
        return this;
    }


    public BlanketTextView maxWidth(int maxpixels) {
        textView.setMaxWidth(maxpixels);
        return this;
    }


    public BlanketTextView ems(int ems) {
        textView.setEms(ems);
        return this;
    }


    public BlanketTextView width(int pixels) {
        textView.setWidth(pixels);
        return this;
    }


    public BlanketTextView lineSpacing(float add, float mult) {
        textView.setLineSpacing(add, mult);
        return this;
    }


    public BlanketTextView freezesText(boolean freezesText) {
        textView.setFreezesText(freezesText);
        return this;
    }

    public BlanketTextView text(CharSequence text, TextView.BufferType type) {
        textView.setText(text, type);
        return this;
    }

    public BlanketTextView text(String text) {
        textView.setText(text);
        return this;
    }

    public BlanketTextView text(@StringRes int stringRes) {
        textView.setText(stringRes);
        return this;
    }

    @TargetApi(23)
    public BlanketTextView customInsertionActionModeCallback(ActionMode.Callback actionModeCallback) {
        textView.setCustomInsertionActionModeCallback(actionModeCallback);
        return this;
    }

    public BlanketTextView customSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        textView.setCustomSelectionActionModeCallback(actionModeCallback);
        return this;
    }

    public BlanketTextView scroller(Scroller s) {
        textView.setScroller(s);
        return this;
    }

    public BlanketTextView selected(boolean selected) {
        textView.setSelected(selected);
        return this;
    }

    public BlanketTextView cursorVisible(boolean visible) {
        textView.setCursorVisible(visible);
        return this;
    }

    public BlanketTextView selectAllOnFocus(boolean selectAllOnFocus) {
        textView.setSelectAllOnFocus(selectAllOnFocus);
        return this;
    }

    public BlanketTextView marqueeRepeatLimit(int marqueeLimit) {
        textView.setMarqueeRepeatLimit(marqueeLimit);
        return this;
    }

    public BlanketTextView ellipsize(TextUtils.TruncateAt where) {
        textView.setEllipsize(where);
        return this;
    }

    public BlanketTextView singleLine(boolean singleLine) {
        textView.setSingleLine(singleLine);
        return this;
    }

    public BlanketTextView singleLine() {
        textView.setSingleLine();
        return this;
    }

    public BlanketTextView allCaps(boolean allCaps) {
        textView.setAllCaps(allCaps);
        return this;
    }

    public BlanketTextView includeFontPadding(boolean includepad) {
        textView.setIncludeFontPadding(includepad);
        return this;
    }

    public BlanketTextView extractedText(ExtractedText text) {
        textView.setExtractedText(text);
        return this;
    }

    public BlanketTextView textIsSelectable(boolean selectable) {
        textView.setTextIsSelectable(selectable);
        return this;
    }

    public BlanketTextView filters(InputFilter[] filters) {
        textView.setFilters(filters);
        return this;
    }

    public BlanketTextView error(CharSequence error, Drawable icon) {
        textView.setError(error, icon);
        return this;
    }

    public BlanketTextView error(CharSequence error) {
        textView.setError(error);
        return this;
    }

    public BlanketTextView inputExtras(int xmlResId) throws XmlPullParserException, IOException {
        textView.setInputExtras(xmlResId);
        return this;
    }

    public BlanketTextView privateImeOptions(String type) {
        textView.setPrivateImeOptions(type);
        return this;
    }

    public BlanketTextView onEditorActionListener(TextView.OnEditorActionListener l) {
        textView.setOnEditorActionListener(l);
        return this;
    }

    public BlanketTextView imeActionLabel(CharSequence label, int actionId) {
        textView.setImeActionLabel(label, actionId);
        return this;
    }

    public BlanketTextView imeOptions(int imeOptions) {
        textView.setImeOptions(imeOptions);
        return this;
    }

    public BlanketTextView rawInputType(int type) {
        textView.setRawInputType(type);
        return this;
    }

    public BlanketTextView inputType(int type) {
        textView.setInputType(type);
        return this;
    }

    public BlanketTextView keyListener(KeyListener input) {
        textView.setKeyListener(input);
        return this;
    }

}

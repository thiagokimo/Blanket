package br.com.marcellogalhardo.blanket.view;

import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;

public class BlanketEditText extends BlanketTextView {

    private final EditText editText;

    public BlanketEditText(EditText editText) {
        super(editText);
        this.editText = editText;
    }

    @Override
    public EditText reference() {
        return editText;
    }

    public BlanketEditText ellipsize(TextUtils.TruncateAt ellipsis) {
        editText.setEllipsize(ellipsis);
        return this;
    }

    public BlanketEditText selection(int index) {
        editText.setSelection(index);
        return this;
    }

    public BlanketEditText selection(int start, int stop) {
        editText.setSelection(start, stop);
        return this;
    }

    public BlanketEditText text(CharSequence text, TextView.BufferType type) {
        editText.setText(text, type);
        return this;
    }
}

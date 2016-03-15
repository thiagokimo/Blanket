package br.com.marcellogalhardo.blanket.binder.impl;

import android.app.Dialog;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.view.View;

import br.com.marcellogalhardo.blanket.binder.ViewBinder;

public class DialogViewBinder implements ViewBinder {

    private final Dialog dialog;

    public DialogViewBinder(@NonNull Dialog dialog) {
        this.dialog = dialog;
    }

    @Override
    @SuppressWarnings({ "unchecked", "UnusedDeclaration" })
    public final <T extends View> T findById(@IdRes int id) {
        return (T) dialog.findViewById(id);
    }

}

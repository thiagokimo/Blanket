package br.com.marcellogalhardo.blanket.binder.impl;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.view.View;

import br.com.marcellogalhardo.blanket.binder.ViewBinder;

public class ActivityViewBinder implements ViewBinder {

    private final Activity activity;

    public ActivityViewBinder(@NonNull Activity activity) {
        this.activity = activity;
    }

    @Override
    @SuppressWarnings({ "unchecked", "UnusedDeclaration" })
    public final <T extends View> T findById(@IdRes int id) {
        return (T) activity.findViewById(id);
    }

}

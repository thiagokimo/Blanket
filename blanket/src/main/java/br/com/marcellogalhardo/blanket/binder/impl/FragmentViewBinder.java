package br.com.marcellogalhardo.blanket.binder.impl;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;

import br.com.marcellogalhardo.blanket.binder.ViewBinder;

public class FragmentViewBinder implements ViewBinder {

    private final View view;

    public FragmentViewBinder(@NonNull Fragment fragment) {
        View view = fragment.getView();
        if (view != null) {
            this.view = view;
        } else {
            throw new IllegalAccessError("No root view.");
        }
    }

    @Override
    @SuppressWarnings({ "unchecked", "UnusedDeclaration" })
    public <T extends View> T findById(@IdRes int id) {
        return (T) view.findViewById(id);
    }

}

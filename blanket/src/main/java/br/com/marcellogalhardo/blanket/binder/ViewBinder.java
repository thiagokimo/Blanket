package br.com.marcellogalhardo.blanket.binder;

import android.support.annotation.IdRes;
import android.view.View;

public interface ViewBinder {

    @SuppressWarnings({ "unchecked", "UnusedDeclaration" })
    <T extends View> T findById(@IdRes int id);

}

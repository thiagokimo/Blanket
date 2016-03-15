package br.com.marcellogalhardo.blanket.binder;

import android.app.Activity;
import android.app.Dialog;
import android.support.v4.app.Fragment;

import br.com.marcellogalhardo.blanket.binder.impl.ActivityViewBinder;
import br.com.marcellogalhardo.blanket.binder.impl.DialogViewBinder;
import br.com.marcellogalhardo.blanket.binder.impl.FragmentViewBinder;

public class ViewBinderFactory {

    public static ViewBinder create(Activity activity) {
        return new ActivityViewBinder(activity);
    }

    public static ViewBinder create(Fragment fragment) {
        return new FragmentViewBinder(fragment);
    }

    public static ViewBinder create(Dialog dialog) {
        return new DialogViewBinder(dialog);
    }

}

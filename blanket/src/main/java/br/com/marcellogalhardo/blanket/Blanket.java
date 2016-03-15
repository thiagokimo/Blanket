package br.com.marcellogalhardo.blanket;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import br.com.marcellogalhardo.blanket.binder.ViewBinder;
import br.com.marcellogalhardo.blanket.binder.ViewBinderFactory;
import br.com.marcellogalhardo.blanket.view.BlanketButton;
import br.com.marcellogalhardo.blanket.view.BlanketCheckBox;
import br.com.marcellogalhardo.blanket.view.BlanketEditText;
import br.com.marcellogalhardo.blanket.view.BlanketImageButton;
import br.com.marcellogalhardo.blanket.view.BlanketImageView;
import br.com.marcellogalhardo.blanket.view.BlanketProgressBar;
import br.com.marcellogalhardo.blanket.view.BlanketRadioButton;
import br.com.marcellogalhardo.blanket.view.BlanketSeekBar;
import br.com.marcellogalhardo.blanket.view.BlanketSwitch;
import br.com.marcellogalhardo.blanket.view.BlanketTextView;
import br.com.marcellogalhardo.blanket.view.BlanketToggleButton;

public class Blanket {

    private ViewBinder binder;

    private Blanket() {
        super();
    }

    public static Blanket with(Activity activity) {
        Blanket blanket = new Blanket();
        blanket.binder = ViewBinderFactory.create(activity);
        return blanket;
    }

    public static Blanket with(Fragment fragment) {
        Blanket blanket = new Blanket();
        blanket.binder = ViewBinderFactory.create(fragment);
        return blanket;
    }

    public static Blanket with(Dialog dialog) {
        Blanket blanket = new Blanket();
        blanket.binder = ViewBinderFactory.create(dialog);
        return blanket;
    }

    public BlanketTextView textView(@IdRes int id) {
        return BlanketBag.wrap(binder.<TextView>findById(id));
    }

    public BlanketImageView imageView(@IdRes int id) {
        return BlanketBag.wrap(binder.<ImageView>findById(id));
    }

    public BlanketButton button(@IdRes int id) {
        return BlanketBag.wrap(binder.<Button>findById(id));
    }

    public BlanketRadioButton radioButton(@IdRes int id) {
        return BlanketBag.wrap(binder.<RadioButton>findById(id));
    }

    public BlanketCheckBox checkBox(@IdRes int id) {
        return BlanketBag.wrap(binder.<CheckBox>findById(id));
    }

    public BlanketSwitch switchView(@IdRes int id) {
        return BlanketBag.wrap(binder.<Switch>findById(id));
    }

    public BlanketToggleButton toggleButton(@IdRes int id) {
        return BlanketBag.wrap(binder.<ToggleButton>findById(id));
    }

    public BlanketImageButton imageButton(@IdRes int id) {
        return BlanketBag.wrap(binder.<ImageButton>findById(id));
    }

    public BlanketProgressBar progressBar(@IdRes int id) {
        return BlanketBag.wrap(binder.<ProgressBar>findById(id));
    }

    public BlanketSeekBar seekBar(@IdRes int id) {
        return BlanketBag.wrap(binder.<SeekBar>findById(id));
    }

    public BlanketEditText editText(@IdRes int id) {
        return BlanketBag.wrap(binder.<EditText>findById(id));
    }

}

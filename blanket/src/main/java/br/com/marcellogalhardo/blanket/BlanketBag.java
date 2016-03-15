package br.com.marcellogalhardo.blanket;

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

public class BlanketBag {

    public static BlanketTextView wrap(TextView textView) {
        return new BlanketTextView(textView);
    }

    public static BlanketImageView wrap(ImageView imageView) {
        return new BlanketImageView(imageView);
    }

    public static BlanketButton wrap(Button button) {
        return new BlanketButton(button);
    }

    public static BlanketRadioButton wrap(RadioButton button) {
        return new BlanketRadioButton(button);
    }

    public static BlanketCheckBox wrap(CheckBox button) {
        return new BlanketCheckBox(button);
    }

    public static BlanketSwitch wrap(Switch button) {
        return new BlanketSwitch(button);
    }

    public static BlanketToggleButton wrap(ToggleButton button) {
        return new BlanketToggleButton(button);
    }

    public static BlanketImageButton wrap(ImageButton button) {
        return new BlanketImageButton(button);
    }

    public static BlanketProgressBar wrap(ProgressBar bar) {
        return new BlanketProgressBar(bar);
    }

    public static BlanketSeekBar wrap(SeekBar bar) {
        return new BlanketSeekBar(bar);
    }

    public static BlanketEditText wrap(EditText button) {
        return new BlanketEditText(button);
    }

}

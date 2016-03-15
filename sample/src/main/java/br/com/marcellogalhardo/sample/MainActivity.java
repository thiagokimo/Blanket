package br.com.marcellogalhardo.sample;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import br.com.marcellogalhardo.blanket.Blanket;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        Blanket blanket = Blanket.with(this);
        blanket.textView(R.id.textviewHelloWorld)
                .text("teste")
                .textColor(ContextCompat.getColor(this, R.color.colorAccent))
                .textSize(50)
                .allCaps(true)
                .enabled(true)
                .reference();
    }
}

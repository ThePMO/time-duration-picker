package tech.olbri.android.timedurationpicker.sample;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void startInputActivity(View view) {
        tech.olbri.android.timedurationpicker.sample.PickerActivity.start(this);
    }

    public void startInputDialog(View view) {
        new PickerDialogFragment().show(getSupportFragmentManager(), "dialog");
    }

    public void startPreferences(View view) {
        PrefActivity.start(this);
    }
}

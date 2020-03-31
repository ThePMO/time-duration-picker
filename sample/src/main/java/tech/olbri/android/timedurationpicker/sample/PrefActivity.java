package tech.olbri.android.timedurationpicker.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PrefActivity extends AppCompatActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, PrefActivity.class));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pref_activity);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings_container, new TimePickerPreferenceFragment())
                .commit();
    }
}

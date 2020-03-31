package tech.olbri.android.timedurationpicker.sample;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import tech.olbri.android.timedurationpicker.TimeDurationPickerPreference;

public class TimePickerPreferenceFragment extends PreferenceFragmentCompat {
	@Override
	public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
		setPreferencesFromResource(R.xml.preferences, rootKey);
	}

	@Override
	public void onDisplayPreferenceDialog(Preference preference) {
		if (preference instanceof TimeDurationPickerPreference) {
			DialogFragment dialogFragment = new PickerDialogFragment();
			dialogFragment.setTargetFragment(this, 0);
			dialogFragment.show(getFragmentManager(), null);
		} else super.onDisplayPreferenceDialog(preference);
	}
}

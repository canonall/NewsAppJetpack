package com.canonal.newsappjetpack.fragment

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.canonal.newsappjetpack.R


class ProfileFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preference_profile, rootKey)
    }

}
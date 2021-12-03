package com.canonal.newsappjetpack.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.preference.PreferenceFragmentCompat
import com.canonal.newsappjetpack.R
import com.canonal.newsappjetpack.databinding.FragmentProfileBinding

class ProfileFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preference_profile, rootKey)
    }

}
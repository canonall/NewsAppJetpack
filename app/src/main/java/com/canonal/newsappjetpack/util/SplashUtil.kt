package com.canonal.newsappjetpack.util

import android.app.Activity
import com.canonal.newsappjetpack.R
import com.rbddevs.splashy.Splashy

class SplashUtil {
    companion object {
        fun setSplashy(activity: Activity) {
            Splashy(activity)
                .setLogo(R.drawable.ic_nba)
                .setBackgroundColor(R.color.nba_blue_dark)
                .showTitle(false)
                .setAnimation(Splashy.Animation.GLOW_LOGO)
                .setProgressColor(R.color.nba_blue_dark)
                .setFullScreen(true)
                .setDuration(3500)
                .show()
        }
    }
}
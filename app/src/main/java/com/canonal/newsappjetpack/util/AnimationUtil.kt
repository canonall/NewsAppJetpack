package com.canonal.newsappjetpack.util

import androidx.navigation.NavOptions
import androidx.navigation.navOptions
import com.canonal.newsappjetpack.R

class AnimationUtil {
    companion object {
        fun getFragmentSlideNavOptions(): NavOptions = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right

            }
        }
    }
}
package com.canonal.newsappjetpack.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
open class News(
    val title: String,
    val text: String,
    val imageUrl: String,
    val date: String,
): Parcelable
package com.canonal.newsappjetpack.model

import android.graphics.drawable.Drawable

abstract class News(
    val title: String,
    val text: String,
    val image: Drawable?,
    val date: String
)
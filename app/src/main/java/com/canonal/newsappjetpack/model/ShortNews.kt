package com.canonal.newsappjetpack.model

import android.graphics.drawable.Drawable

class ShortNews(
    title: String,
    text: String,
    image: Drawable?,
    date: String
) :
    News(
        title,
        text,
        image,
        date
    )
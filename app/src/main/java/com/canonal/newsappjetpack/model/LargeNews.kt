package com.canonal.newsappjetpack.model

import android.graphics.drawable.Drawable

class LargeNews(
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
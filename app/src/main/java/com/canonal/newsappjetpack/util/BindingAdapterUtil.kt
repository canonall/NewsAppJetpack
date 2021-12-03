package com.canonal.newsappjetpack.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("imageUrl")
fun setImageWithPicasso(imageView: ImageView, imageUrl: String) {
    Picasso.get().isLoggingEnabled = true
    Picasso.get().load(imageUrl).fit().centerCrop().into(imageView)

}


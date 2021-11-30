package com.canonal.newsappjetpack.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.canonal.newsappjetpack.databinding.ItemShortNewsBinding
import com.canonal.newsappjetpack.model.News
import com.canonal.newsappjetpack.model.ShortNews

class ShortNewsViewHolder(
    private val binding: ItemShortNewsBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(shortNews: ShortNews, onNewsClicked: (News) -> Unit) {
        binding.shortNews = shortNews
        binding.rlShortNews.setOnClickListener {
            onNewsClicked.invoke(shortNews)
        }
    }
}
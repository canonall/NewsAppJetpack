package com.canonal.newsappjetpack.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.canonal.newsappjetpack.databinding.ItemLargeNewsBinding
import com.canonal.newsappjetpack.model.LargeNews
import com.canonal.newsappjetpack.model.News

class LargeNewsViewHolder(
    private val binding: ItemLargeNewsBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(largeNews: LargeNews, onNewsClicked: (News) -> Unit) {
        binding.largeNews = largeNews
        binding.rlLargeNews.setOnClickListener {
            onNewsClicked.invoke(largeNews)
        }
    }
}
package com.canonal.newsappjetpack.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.canonal.newsappjetpack.R
import com.canonal.newsappjetpack.databinding.ItemLargeNewsBinding
import com.canonal.newsappjetpack.databinding.ItemShortNewsBinding
import com.canonal.newsappjetpack.model.LargeNews
import com.canonal.newsappjetpack.model.News
import com.canonal.newsappjetpack.model.NewsType
import com.canonal.newsappjetpack.model.ShortNews
import com.canonal.newsappjetpack.viewHolder.LargeNewsViewHolder
import com.canonal.newsappjetpack.viewHolder.ShortNewsViewHolder

class NewsAdapter(
    private val newsList: List<News>,
    private val onNewsClicked: (News) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var shortNewsBinding: ItemShortNewsBinding
    private lateinit var largeNewsBinding: ItemLargeNewsBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return when (viewType) {
            NewsType.SHORT_NEWS.value -> {
                shortNewsBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.item_short_news,
                    parent,
                    false
                )
                ShortNewsViewHolder(shortNewsBinding)
            }
            NewsType.LARGE_NEWS.value -> {
                largeNewsBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.item_large_news,
                    parent,
                    false
                )
                LargeNewsViewHolder(largeNewsBinding)
            }
            else -> {
                shortNewsBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.item_short_news,
                    parent,
                    false
                )
                ShortNewsViewHolder(shortNewsBinding)
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (newsList[position]) {
            is ShortNews -> {
                (holder as ShortNewsViewHolder).bind(newsList[position] as ShortNews, onNewsClicked)
            }
            is LargeNews -> {
                (holder as LargeNewsViewHolder).bind(newsList[position] as LargeNews, onNewsClicked)
            }
        }

    }

    override fun getItemCount(): Int = newsList.size

    override fun getItemViewType(position: Int): Int {

        return when (newsList[position]) {
            is ShortNews -> {
                NewsType.SHORT_NEWS.value
            }
            is LargeNews -> {
                NewsType.LARGE_NEWS.value
            }
            else -> {
                NewsType.SHORT_NEWS.value
            }
        }

    }
}
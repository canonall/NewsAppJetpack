package com.canonal.newsappjetpack.util

import android.content.Context
import androidx.core.content.ContextCompat
import com.canonal.newsappjetpack.R
import com.canonal.newsappjetpack.model.LargeNews
import com.canonal.newsappjetpack.model.News
import com.canonal.newsappjetpack.model.ShortNews

class DummyData {
    companion object{
        fun getNewsData(context: Context):List<News>{
            val newsList = arrayListOf<News>()

            newsList.add(ShortNews(
                context.getString(R.string.short_news_title_1),
                context.getString(R.string.short_news_text_1),
                ContextCompat.getDrawable(context,R.drawable.type_one_image),
                context.getString(R.string.short_news_date_1)

            ))

            newsList.add(LargeNews(
                context.getString(R.string.large_news_title_1),
                context.getString(R.string.large_news_text_1),
                ContextCompat.getDrawable(context,R.drawable.type_two_image),
                context.getString(R.string.large_news_date_1)

            ))

            newsList.add(ShortNews(
                context.getString(R.string.short_news_title_2),
                context.getString(R.string.short_news_text_2),
                ContextCompat.getDrawable(context,R.drawable.type_one_image),
                context.getString(R.string.short_news_date_2)

            ))

            newsList.add(LargeNews(
                context.getString(R.string.large_news_title_2),
                context.getString(R.string.large_news_text_2),
                ContextCompat.getDrawable(context,R.drawable.type_two_image),
                context.getString(R.string.large_news_date_2)

            ))

            return newsList
        }
    }
}
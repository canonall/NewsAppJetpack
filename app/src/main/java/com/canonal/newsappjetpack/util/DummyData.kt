package com.canonal.newsappjetpack.util

import android.content.Context
import com.canonal.newsappjetpack.R
import com.canonal.newsappjetpack.model.LargeNews
import com.canonal.newsappjetpack.model.News
import com.canonal.newsappjetpack.model.ShortNews

class DummyData {
    companion object {
        fun getNewsData(context: Context): List<News> {
            val newsList = arrayListOf<News>()

            newsList.add(
                LargeNews(
                    context.getString(R.string.large_news_title_1),
                    context.getString(R.string.large_news_text_1),
                    context.getString(R.string.large_news_url_1),
                    context.getString(R.string.large_news_date_1)

                )
            )

            newsList.add(
                ShortNews(
                    context.getString(R.string.short_news_title_1),
                    context.getString(R.string.short_news_text_1),
                    context.getString(R.string.short_news_url_1),
                    context.getString(R.string.short_news_date_1)

                )
            )



            newsList.add(
                ShortNews(
                    context.getString(R.string.short_news_title_2),
                    context.getString(R.string.short_news_text_2),
                    context.getString(R.string.short_news_url_2),
                    context.getString(R.string.short_news_date_2)

                )
            )

            newsList.add(
                LargeNews(
                    context.getString(R.string.large_news_title_2),
                    context.getString(R.string.large_news_text_2),
                    context.getString(R.string.large_news_url_2),
                    context.getString(R.string.large_news_date_2)

                )
            )

            newsList.add(
                LargeNews(
                    context.getString(R.string.large_news_title_2),
                    context.getString(R.string.large_news_text_2),
                    context.getString(R.string.large_news_url_2),
                    context.getString(R.string.large_news_date_2)

                )
            )

            return newsList
        }
    }
}
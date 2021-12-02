package com.canonal.newsappjetpack.provider

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.os.Bundle
import android.widget.RemoteViews
import androidx.navigation.NavDeepLinkBuilder
import com.canonal.newsappjetpack.R
import com.canonal.newsappjetpack.util.DummyData


class NewsDetailDeepLinkProvider : AppWidgetProvider() {

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        val remoteViews = RemoteViews(context.packageName, R.layout.widget_news)

        val newsList = DummyData.getNewsData(context)
        val args = Bundle()
        args.putString("myKey", newsList[0].title)
        args.putString("myKey", newsList[1].title)
        args.putString("myKey", newsList[2].title)
        args.putString("myKey", newsList[3].title)

        val pendingIntent = NavDeepLinkBuilder(context)
            .setGraph(R.navigation.nav_graph)
            .setDestination(R.id.newsDetailFragment)
            .setArguments(args)
            .createPendingIntent()

        remoteViews.setOnClickPendingIntent(R.id.btnWidget, pendingIntent)
        appWidgetManager.updateAppWidget(appWidgetIds, remoteViews)

    }
}
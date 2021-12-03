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
        args.putParcelable("myKey0", newsList[0])
        args.putParcelable("myKey1", newsList[1])
        args.putParcelable("myKey2", newsList[2])

        val pendingIntent = NavDeepLinkBuilder(context)
            .setGraph(R.navigation.nav_graph)
            .setDestination(R.id.newsDetailFragment)
            .setArguments(args)
            .createPendingIntent()

        remoteViews.setOnClickPendingIntent(R.id.tvWidget, pendingIntent)
        appWidgetManager.updateAppWidget(appWidgetIds, remoteViews)

    }
}
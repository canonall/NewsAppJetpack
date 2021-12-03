package com.canonal.newsappjetpack.provider

import android.app.PendingIntent
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

        val args1 = Bundle()
        args1.putParcelable("myKey", newsList[0])

        val args2 = Bundle()
        args2.putParcelable("myKey", newsList[1])

        val args3 = Bundle()
        args3.putParcelable("myKey", newsList[2])

        val args4 = Bundle()
        args4.putParcelable("myKey", newsList[3])

        remoteViews.setOnClickPendingIntent(R.id.tvWidgetNewsTitle1, getPendingIntent(context,args1))
        remoteViews.setOnClickPendingIntent(R.id.tvWidgetNewsTitle2, getPendingIntent(context,args2))
        remoteViews.setOnClickPendingIntent(R.id.tvWidgetNewsTitle3, getPendingIntent(context,args3))
        remoteViews.setOnClickPendingIntent(R.id.tvWidgetNewsTitle4, getPendingIntent(context,args4))
        appWidgetManager.updateAppWidget(appWidgetIds, remoteViews)

    }

    private fun getPendingIntent(context: Context, args: Bundle): PendingIntent{
        return NavDeepLinkBuilder(context)
            .setGraph(R.navigation.nav_graph)
            .setDestination(R.id.newsDetailFragment)
            .setArguments(args)
            .createPendingIntent()
    }
}
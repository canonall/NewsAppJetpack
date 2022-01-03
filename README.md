# NewsAppJetpack <img src="https://upload.wikimedia.org/wikipedia/it/thumb/a/a8/NBA_75th_anniversary_logo.svg.png/703px-NBA_75th_anniversary_logo.svg.png" width="50" height="42"/>

This project aims to demonstrate basic Android Jetpack Navigation components as if Navigation Drawer, Toolbar menus, Bottombar Navigations, Deeplinks with widgets
and their relationship with fragments in the context of a sports news application, specifically NBA. The application uses dummy data that is generated inside the app. The Application enhances my previous [NewsApp](https://github.com/canonall/NewsApp) which demonstrates fragments and fragment transitions with the traditional way.

You can check out how to build Navigation Graph with multiple fragments and make the transitions between them. As part of navigation, The user can see the Up icon when the fragment on the screen is not a top-level destination. If the fragment on the screen is a top-level destination, then the drawer icon is shown to the user. When passing arguments from fragment to fragment safeArgs library is used in order to provide type-safety.

The application also uses AndroidX Preference library 
in order to create the Settings screen with ease. It should be mentioned that Preference items are created with demonstration purpose only and don't have any functional effect(
PreferencesFragment  and ProfileFragment). The Application also shows the use of RecyclerView with different types of elements and layouts with a single adapter. NewsAdapter checks the newsList item and sets the layout  according to the type of the item(LargeNews or ShortNews). To generate launcher screen [Splashy library](https://github.com/rahuldange09/Splashy) is used.

<img src="/NewsAppJetpack/navigation components.gif" width="350" height="680" />

You can set a widget which consist a list of News and reach the details of the selected News via a deeplink. In order to to that we just need to create a pendingIntent with NavDeepBuilder and set the destination.

<img src="/NewsAppJetpack/widget.gif" width="350" height="680" />



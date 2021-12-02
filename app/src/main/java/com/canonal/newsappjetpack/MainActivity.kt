package com.canonal.newsappjetpack

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import com.canonal.newsappjetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val host: NavHostFragment =
            supportFragmentManager.findFragmentById(R.id.news_nav_host_fragment) as NavHostFragment?
                ?: return

        val navController = host.navController
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.newsFragment, R.id.profileFragment),
            binding.drawerLayout
        )

        setToolBar()
        setBottomNavBar(navController)
        setupNavigationMenu(navController)
        setupActionBar(navController, appBarConfiguration)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_overflow, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(findNavController(R.id.news_nav_host_fragment))
                || super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.news_nav_host_fragment).navigateUp(
            appBarConfiguration
        )
    }

    private fun setToolBar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    private fun setBottomNavBar(navController: NavController) {
        binding.bottomBar.setupWithNavController(navController)
    }

    private fun setupNavigationMenu(navController: NavController) {
        binding.navView.setupWithNavController(navController)
    }

    private fun setupActionBar(
        navController: NavController,
        appBarConfiguration: AppBarConfiguration
    ) {
        setupActionBarWithNavController(navController, appBarConfiguration)
    }
}
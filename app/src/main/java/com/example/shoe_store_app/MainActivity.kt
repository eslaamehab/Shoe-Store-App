package com.example.shoe_store_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.shoe_store_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        drawerLayout = binding.drawerLayout

        // find the navController from myNavHostFragment
        // since we are using KTX extension function, we can call this.findNavController
//        navController = this.findNavController(R.id.nav_host_fragment)

        // link the navController to our ActionBar
//        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
//        NavigationUI.setupWithNavController(binding.navView, navController)

        // remove fel akher

//        setSupportActionBar(binding.toolbar)
//        drawerLayout = binding.drawerLayout
//        navController = this.findNavController(R.id.nav_host_fragment)
//        NavigationUI.setupActionBarWithNavController(this, navController)


    }
    //remove fel akher
//    override fun onSupportNavigateUp(): Boolean {
//        return navController.navigateUp()
//    }
}
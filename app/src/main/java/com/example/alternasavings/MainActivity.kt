package com.example.alternasavings

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.alternasavings.databinding.FragmentRegisterBinding
import com.example.alternasavings.ui.fragments.*
import com.example.alternasavings.ui.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var navcontroller: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navcontroller = navHostFragment.navController

        setupActionBarWithNavController(navcontroller)
    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp() || navcontroller.navigateUp()
    }

}
//for navigation drawer
//    lateinit var drawerLayout: DrawerLayout
//    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//        // drawer layout instance to toggle the menu icon to open
//        // drawer and back button to close drawer
//        drawerLayout = findViewById(R.id.my_drawer_layout)
//        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)
//
//        // pass the Open and Close toggle for the drawer layout listener
//        // to toggle the button
//        drawerLayout.addDrawerListener(actionBarDrawerToggle)
//        actionBarDrawerToggle.syncState()
//
//        // to make the Navigation drawer icon always appear on the action bar
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//    }
//
//    // override the onOptionsItemSelected()
//    // function to implement
//    // the item click listener callback
//    // to open and close the navigation
//    // drawer when the icon is clicked
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
//            true
//        } else super.onOptionsItemSelected(item)
//    }

package com.example.payment

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.payment.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.HashSet

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigation.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->

            if (destination.id == R.id.startFragment) {
                bottomNavigation.visibility=View.GONE
            } else if (destination.id == R.id.chooseFragment) {
                bottomNavigation.visibility=View.GONE
            } else if (destination.id == R.id.weightManFragment) {
                bottomNavigation.visibility=View.GONE
            } else if (destination.id == R.id.weightWomenFragment) {
                bottomNavigation.visibility=View.GONE
            } else if (destination.id == R.id.sleepManFragment) {
                bottomNavigation.visibility=View.GONE
            } else if (destination.id == R.id.sleepWomenFragment) {
                bottomNavigation.visibility=View.GONE
            } else if (destination.id == R.id.wakeupManFragment) {
                bottomNavigation.visibility=View.GONE
            } else if (destination.id == R.id.wakeupWomenFragment) {
                bottomNavigation.visibility=View.GONE
            } else {
                bottomNavigation.visibility=View.VISIBLE
            }
        }

    }

}
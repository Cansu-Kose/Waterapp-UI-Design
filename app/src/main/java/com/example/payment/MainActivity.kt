package com.example.payment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.payment.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        //setContentView(R.layout.activity_main)
        init()
        val navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        val navController=navHostFragment.navController
        binding.bottomNavigation.setupWithNavController(navController)

    }
    private fun init(){

    }
}
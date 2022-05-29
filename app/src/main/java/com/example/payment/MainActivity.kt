package com.example.payment

import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.payment.databinding.ActivityMainBinding
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.IdpResponse
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
//    internal var TAG="EMAILUI_AUTH"
    private lateinit var binding: ActivityMainBinding
    private lateinit var actionBar: ActionBar
    private lateinit var progressDialog: ProgressDialog
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        actionBar= supportActionBar!!
        actionBar.title="Login"

        progressDialog= ProgressDialog(this)
        progressDialog.setTitle("Please wait")
        progressDialog.setMessage("Logging In...")
        progressDialog.setCanceledOnTouchOutside(false)

        firebaseAuth=FirebaseAuth.getInstance()
        checkUser();


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
            } else if (destination.id == R.id.loginFragment) {
                bottomNavigation.visibility=View.GONE
            } else if (destination.id == R.id.registerFragment) {
                bottomNavigation.visibility=View.GONE
            }else {
                bottomNavigation.visibility=View.VISIBLE
            }
        }

    }

    private fun checkUser() {
        val firebaseUser=firebaseAuth.currentUser
        if (firebaseUser!=null){
            startActivity(Intent(this,LoginFragment::class.java))
            finish()
        }
    }

//    override fun onStart() {
//        super.onStart()
//        val auth=FirebaseAuth.getInstance()
//        if (auth.currentUser!= null)
//        {
//            Toast.makeText(applicationContext, "User already sign in,must sign out first", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode==1234){
//            val response=IdpResponse.fromResultIntent(data)
//            if (resultCode==Activity.RESULT_OK){
//                val user=FirebaseAuth.getInstance().currentUser
//                Toast.makeText(applicationContext, "Succesful sign in", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//    }
//    fun onSignInClickListener(view: View){
//        val providers = arrayListOf(
//            AuthUI.IdpConfig.EmailBuilder().build())
//        startActivityForResult(
//            AuthUI.getInstance()
//                .createSignInIntentBuilder()
//                .setAvailableProviders(providers)
//                .build(),
//            1234)
//    }


}
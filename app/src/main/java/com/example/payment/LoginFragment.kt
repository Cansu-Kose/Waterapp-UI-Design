package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class LoginFragment : Fragment() {
    private lateinit var fragmentLoginBinding: FragmentLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

//    val sp = context?.getSharedPreferences("pref", 0)
//    val ka=sp?.getString("email","email not found")
//    val s=sp?.getString("password","password not found")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentLoginBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        return fragmentLoginBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentLoginBinding.button4.setOnClickListener {
            Firebase.auth.signOut()
        }
        fragmentLoginBinding.button5.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_chooseFragment)
        }
    }

    private fun checkUser() {
        val firebaseUser=firebaseAuth.currentUser
        if (firebaseUser!=null){
            val email=firebaseUser.email

        }else{
            findNavController().navigate(R.id.action_loginFragment_to_startFragment)
        }
    }


}
package com.example.payment

import android.app.ProgressDialog
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentRegisterBinding
import com.google.firebase.auth.FirebaseAuth


class RegisterFragment : Fragment() {
    private lateinit var fragmentRegisterBinding: FragmentRegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var progressDialog: ProgressDialog
    private var email=""
    private var password=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentRegisterBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_register, container, false)
        return fragmentRegisterBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentRegisterBinding.button7.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_startFragment)
        }
        fragmentRegisterBinding.button6.setOnClickListener {
            validateData()

        }
    }

    private fun validateData() {
        email=fragmentRegisterBinding.editTextName2.text.toString().trim()
        password=fragmentRegisterBinding.editTextPassword2.text.toString().trim()

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            fragmentRegisterBinding.editTextName2.error = "Invalid email format"

        }
        else if (TextUtils.isEmpty(password)){
            fragmentRegisterBinding.editTextPassword2.error="Please enter password"
        }
        else if (password.length<6){
            fragmentRegisterBinding.editTextPassword2.error="Password must at least 6 character long"
        }
        else{
            firebaseLogin()
        }

    }

    private fun firebaseLogin() {
        progressDialog.show()
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                progressDialog.dismiss()
                val firebaseUser=firebaseAuth.currentUser
                val email=firebaseUser!!.email
//                Toast.makeText(this, "LoggedIn as $email", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_startFragment_to_loginFragment)
            }
            .addOnFailureListener { e->
                progressDialog.dismiss()
//                Toast.makeText(this, "Login failed due to ${e.message}", Toast.LENGTH_SHORT).show()
            }

    }


}
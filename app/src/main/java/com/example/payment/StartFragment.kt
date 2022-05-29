package com.example.payment

import android.app.ProgressDialog
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentStartBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase


class StartFragment : Fragment() {

    private lateinit var fragmentStartBinding:FragmentStartBinding
    private lateinit var progressDialog: ProgressDialog
    private lateinit var firebaseAuth: FirebaseAuth


    val database = Firebase.database
    val myRef = database.getReference("message")


    private var email=""
    private var password=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myRef.setValue("Hello, World!")
//        val sp = context?.getSharedPreferences("pref", 0)
//        val ogka=sp?.getString("email","email not found")
//        val ogs=sp?.getString("password","password not found")
//        if (ogka=="admin"&& ogs=="123"){
//            findNavController().navigate(R.id.action_startFragment_to_loginFragment)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val view=inflater.inflate(R.layout.fragment_start,container,false)
        fragmentStartBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_start,container,false)
        return fragmentStartBinding.root
        // Write a message to the database

    }





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentStartBinding.button.setOnClickListener {
//            val sp = context?.getSharedPreferences("pref", 0)
//            val ka=fragmentStartBinding.editTextName.text.toString()
//            val s=fragmentStartBinding.editTextPassword.text.toString()
//            if (ka=="admin"&& s=="123"){
//                val editor=sp?.edit()
//                editor?.putString("email",ka)
//                editor?.putString("password",s)
//                editor?.commit()
            validateData()
//            findNavController().navigate(R.id.action_startFragment_to_loginFragment)

//            }else{
//                Toast.makeText(getContext(), "Can not login !", Toast.LENGTH_LONG).show();
//            }
        }
        fragmentStartBinding.textView.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_registerFragment)
        }
        //button=view.findViewById(R.id.button)
        //button.setOnClickListener {
        //    findNavController().navigate(R.id.action_startFragment_to_chooseFragment)
        //}
    }

    private fun validateData() {
        email=fragmentStartBinding.editTextName.text.toString().trim()
        password=fragmentStartBinding.editTextPassword.text.toString().trim()

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            fragmentStartBinding.editTextName.error = "Invalid email format"

        }
        else if (TextUtils.isEmpty(password)){
            fragmentStartBinding.editTextPassword.error="Please enter password"
        }
        else{
            firebaseLogin()
        }

    }

    private fun firebaseLogin() {
        progressDialog.show()
        firebaseAuth.signInWithEmailAndPassword(email, password)
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
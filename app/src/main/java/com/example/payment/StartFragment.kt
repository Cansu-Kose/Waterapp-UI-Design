package com.example.payment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    private lateinit var fragmentStartBinding:FragmentStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val database= FirebaseDatabase.getInstance()
//        val refkisiler=database.getReference("kisiler")
//        val kisi=Kisiler("Female",7,23)
//        refkisiler.push().setValue(kisi)
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
    }





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentStartBinding.button.setOnClickListener {
            val sp = context?.getSharedPreferences("pref", 0)
            val ka=fragmentStartBinding.editTextName.text.toString()
            val s=fragmentStartBinding.editTextPassword.text.toString()
            if (ka=="admin"&& s=="123"){
                val editor=sp?.edit()
                editor?.putString("email",ka)
                editor?.putString("password",s)
                editor?.commit()

                findNavController().navigate(R.id.action_startFragment_to_loginFragment)
            }else{
                Toast.makeText(getContext(), "Can not login !", Toast.LENGTH_LONG).show();
            }
        }
        fragmentStartBinding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_registerFragment)
        }
        //button=view.findViewById(R.id.button)
        //button.setOnClickListener {
        //    findNavController().navigate(R.id.action_startFragment_to_chooseFragment)
        //}
    }

}
package com.example.payment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.ActivityMainBinding
import com.example.payment.databinding.FragmentStartBinding
import com.google.firebase.database.FirebaseDatabase
import java.util.HashSet


class StartFragment : Fragment() {

    private lateinit var fragmentStartBinding:FragmentStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val database= FirebaseDatabase.getInstance()
//        val refkisiler=database.getReference("kisiler")
//        val kisi=Kisiler("Female",7,23)
//        refkisiler.push().setValue(kisi)
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
            findNavController().navigate(R.id.action_startFragment_to_chooseFragment)
        }
        //button=view.findViewById(R.id.button)
        //button.setOnClickListener {
        //    findNavController().navigate(R.id.action_startFragment_to_chooseFragment)
        //}
    }

}
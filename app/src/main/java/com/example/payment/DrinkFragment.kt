package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.payment.databinding.ActivityMainBinding
import com.example.payment.databinding.FragmentDrinkBinding


class DrinkFragment : Fragment() {
    private lateinit var fragmentDrinkBinding: FragmentDrinkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentDrinkBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_drink,container,false)
        // Inflate the layout for this fragment
        return fragmentDrinkBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }


}
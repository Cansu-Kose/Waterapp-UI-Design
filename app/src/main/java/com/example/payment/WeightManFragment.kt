package com.example.payment

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentWeightManBinding


class WeightManFragment : Fragment() {

    private lateinit var fragmentWeightManBinding: FragmentWeightManBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentWeightManBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_weight_man,container,false)
        // Inflate the layout for this fragment
        return fragmentWeightManBinding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupNumberPicker()
        fragmentWeightManBinding.backbutton3.setOnClickListener {
            findNavController().navigate(R.id.action_weightManFragment_to_chooseFragment)

        }
        fragmentWeightManBinding.nextbutton2.setOnClickListener {
            findNavController().navigate(R.id.action_weightManFragment_to_wakeupManFragment)
        }

    }
    private fun setupNumberPicker() {
        fragmentWeightManBinding.numPickerMin1.minValue=35
        fragmentWeightManBinding.numPickerMin1.maxValue=150
        fragmentWeightManBinding.numPickerMin1.wrapSelectorWheel = true

        val values= arrayOf("kg","lbs")

        fragmentWeightManBinding.numPickerMin4.minValue=0
        fragmentWeightManBinding.numPickerMin4.maxValue=1
        fragmentWeightManBinding.numPickerMin4.wrapSelectorWheel=true
        fragmentWeightManBinding.numPickerMin4.displayedValues=values


    }

}
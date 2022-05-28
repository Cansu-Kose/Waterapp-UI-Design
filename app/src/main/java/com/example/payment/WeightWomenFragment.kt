package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.NumberPicker
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentWeightWomenBinding
import org.intellij.lang.annotations.Language


class WeightWomenFragment : Fragment() {
    private lateinit var fragmentWeightWomenBinding: FragmentWeightWomenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentWeightWomenBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_weight_women,container,false)
        // Inflate the layout for this fragment
        return fragmentWeightWomenBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupNumberPicker()
        fragmentWeightWomenBinding.backbutton2.setOnClickListener {
            findNavController().navigate(R.id.action_weightWomenFragment_to_chooseFragment)
        }
        fragmentWeightWomenBinding.nextbutton3.setOnClickListener {
            findNavController().navigate(R.id.action_weightWomenFragment_to_wakeupWomenFragment)
        }
    }
    private fun setupNumberPicker() {
        fragmentWeightWomenBinding.numPickerMin2.minValue=35
        fragmentWeightWomenBinding.numPickerMin2.maxValue=150
        fragmentWeightWomenBinding.numPickerMin2.wrapSelectorWheel = true

        val values= arrayOf("kg","lbs")

        fragmentWeightWomenBinding.numPickerMin3.minValue=0
        fragmentWeightWomenBinding.numPickerMin3.maxValue=1
        fragmentWeightWomenBinding.numPickerMin3.wrapSelectorWheel = true
        fragmentWeightWomenBinding.numPickerMin3.displayedValues=values





    }

}
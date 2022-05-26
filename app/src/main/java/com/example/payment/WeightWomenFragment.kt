package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentWeightWomenBinding


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
        fragmentWeightWomenBinding.backbutton2.setOnClickListener {
            findNavController().navigate(R.id.action_weightWomenFragment_to_chooseFragment)
        }
        fragmentWeightWomenBinding.nextbutton3.setOnClickListener {
            findNavController().navigate(R.id.action_weightWomenFragment_to_wakeupWomenFragment)
        }
    }

}
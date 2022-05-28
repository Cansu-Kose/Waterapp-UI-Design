package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentSleepManBinding
import com.example.payment.databinding.FragmentWakeupWomenBinding


class WakeupWomenFragment : Fragment() {
    private lateinit var fragmentWakeupWomenBinding: FragmentWakeupWomenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentWakeupWomenBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_wakeup_women,container,false)
        // Inflate the layout for this fragment
        return fragmentWakeupWomenBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentWakeupWomenBinding.backbutton7.setOnClickListener {
            findNavController().navigate(R.id.action_wakeupWomenFragment_to_weightWomenFragment)

        }
        fragmentWakeupWomenBinding.nextbutton7.setOnClickListener {
            findNavController().navigate(R.id.action_wakeupWomenFragment_to_sleepWomenFragment)
        }
    }




}
package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentSleepWomenBinding



class SleepWomenFragment : Fragment() {
    private lateinit var fragmentSleepWomenBinding: FragmentSleepWomenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentSleepWomenBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_sleep_women,container,false)
        // Inflate the layout for this fragment
        return fragmentSleepWomenBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentSleepWomenBinding.backbutton4.setOnClickListener {
            findNavController().navigate(R.id.action_sleepWomenFragment_to_wakeupWomenFragment)

        }
        fragmentSleepWomenBinding.nextbutton5.setOnClickListener {
            findNavController().navigate(R.id.action_sleepWomenFragment_to_drinkFragment)
        }

    }

}
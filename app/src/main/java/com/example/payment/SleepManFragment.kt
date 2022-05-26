package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentSleepManBinding
import com.example.payment.databinding.FragmentWakeupManBinding


class SleepManFragment : Fragment() {
    private lateinit var fragmentSleepManBinding: FragmentSleepManBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentSleepManBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_sleep_man,container,false)
        // Inflate the layout for this fragment
        return fragmentSleepManBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentSleepManBinding.backbutton5.setOnClickListener {
            findNavController().navigate(R.id.action_sleepManFragment_to_wakeupManFragment)

        }
        fragmentSleepManBinding.nextbutton4.setOnClickListener {
            findNavController().navigate(R.id.action_sleepManFragment_to_drinkFragment)
        }
    }

}
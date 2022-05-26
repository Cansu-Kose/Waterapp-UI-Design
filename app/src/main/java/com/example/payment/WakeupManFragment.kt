package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentWakeupManBinding


class WakeupManFragment : Fragment() {
    private lateinit var fragmentWakeupManBinding: FragmentWakeupManBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentWakeupManBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_wakeup_man,container,false)
        // Inflate the layout for this fragment
        return fragmentWakeupManBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentWakeupManBinding.backbutton6.setOnClickListener {
            findNavController().navigate(R.id.action_wakeupManFragment_to_weightManFragment)

        }
        fragmentWakeupManBinding.nextbutton6.setOnClickListener {
            findNavController().navigate(R.id.action_wakeupManFragment_to_sleepManFragment)
        }
    }


}
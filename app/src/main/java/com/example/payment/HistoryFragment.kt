package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.payment.databinding.FragmentHistoryBinding


class HistoryFragment : Fragment() {
    private lateinit var fragmentHistoryBinding: FragmentHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentHistoryBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_history,container,false)
        // Inflate the layout for this fragment
        return fragmentHistoryBinding.root
    }


}
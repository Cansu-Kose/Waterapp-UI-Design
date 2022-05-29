package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {
    private lateinit var fragmentRegisterBinding: FragmentRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentRegisterBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_register, container, false)
        return fragmentRegisterBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentRegisterBinding.button7.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_startFragment)
        }
    }


}
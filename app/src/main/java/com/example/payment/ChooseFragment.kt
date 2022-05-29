package com.example.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.payment.databinding.ActivityMainBinding
import com.example.payment.databinding.FragmentChooseBinding


class ChooseFragment : Fragment() {
    private lateinit var fragmentChooseBinding: FragmentChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentChooseBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_choose,container,false)
        return fragmentChooseBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentChooseBinding.backbutton.setOnClickListener {
            findNavController().navigate(R.id.action_chooseFragment_to_loginFragment)
        }
        fragmentChooseBinding.maleBttn.setOnClickListener {
            findNavController().navigate(R.id.action_chooseFragment_to_weightManFragment)
        }
        fragmentChooseBinding.femaleBttn.setOnClickListener {
            findNavController().navigate(R.id.action_chooseFragment_to_weightWomenFragment)
        }
        fragmentChooseBinding.nextbutton.setOnClickListener {
            findNavController().navigate(R.id.action_chooseFragment_to_drinkFragment)
        }

    }


}
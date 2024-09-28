package com.example.rwadfive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.rwadfive.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding:FragmentSecondBinding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.navigateBtn2.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        return binding.root
    }


}
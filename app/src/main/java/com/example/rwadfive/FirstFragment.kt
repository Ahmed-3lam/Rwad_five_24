package com.example.rwadfive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.rwadfive.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding: FragmentFirstBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        binding.navigateBtn1.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_firstFragment2_to_secondFragment)
        }
        return binding.root
    }

}
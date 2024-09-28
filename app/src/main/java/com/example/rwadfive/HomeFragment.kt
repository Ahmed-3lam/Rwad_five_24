package com.example.rwadfive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.rwadfive.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.startQuizBtn.setOnClickListener(){
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_questionsFragment)
        }
        return binding.root
    }


}
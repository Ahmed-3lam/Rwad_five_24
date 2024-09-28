package com.example.rwadfive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rwadfive.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentThirdBinding = FragmentThirdBinding.inflate(inflater, container, false)
        return  binding.root
    }

}
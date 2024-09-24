package com.example.rwadfive

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil

import com.example.rwadfive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var selectedGender = Gender.Male
        var selectedheight = 0
        var selectedWeight = 0
        binding.name = "RWAD 5"

        binding.maleBtn.setOnClickListener() {
            binding.maleBtn.setBackgroundColor(Color.parseColor("#2196F3"))
            binding.femaleBtn.setBackgroundColor(Color.parseColor("#797878"))
            selectedGender = Gender.Male
        }

        binding.femaleBtn.setOnClickListener() {
            binding.femaleBtn.setBackgroundColor(Color.parseColor("#2196F3"))
            binding.maleBtn.setBackgroundColor(Color.parseColor("#797878"))
            selectedGender = Gender.Female
        }

        binding.heightSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                binding.heightTextView.text = "Height: $progress cm"
                selectedheight = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        binding.weightSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                binding.weightTextView.text = "Weight: $progress kg"
                selectedWeight = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        binding.calcBtn.setOnClickListener() {

            val bmi = selectedWeight / (selectedheight / 100 * selectedheight / 100)
            val result = when (bmi.toDouble()) {
                in 0.0..18.5 -> "Underweight"
                in 18.5..24.9 -> "Normal"
                in 25.0..29.9 -> "Overweight"
                in 30.0..34.9 -> "Obesity Class 1"
                in 35.0..39.9 -> "Obesity Class 2"
                else -> "Obesity Class 3"
            }

            AlertDialog.Builder(this).setTitle("Result")
                .setMessage("Your BMI is $bmi and you are $result").setPositiveButton("OK", null)
                .show()
        }


    }


}

enum class Gender {
    Male, Female
}
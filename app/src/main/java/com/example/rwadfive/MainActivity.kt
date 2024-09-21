package com.example.rwadfive

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn:Button = findViewById(R.id.rollBtn)

        rollBtn.setOnClickListener(){
            rollDice()
        }





    }
    private fun rollDice(){
        val diceImage:ImageView = findViewById(R.id.dice_image)

        val randomInt = (1..6).random()
      val imageResource = when(randomInt){
          1 -> R.drawable.dice_1
          2 -> R.drawable.dice_2
          3 -> R.drawable.dice_3
          4 -> R.drawable.dice_4
          5 -> R.drawable.dice_5
          else -> R.drawable.dice_6
      }
        diceImage.setImageResource(imageResource)
    }

}
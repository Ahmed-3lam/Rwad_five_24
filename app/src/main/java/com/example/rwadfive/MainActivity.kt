package com.example.rwadfive

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.rwadfive.databinding.ActivityMainBinding
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        Logger.addLogAdapter(AndroidLogAdapter())
        Logger.w("LifeCycle: OnCreate")
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }

//    override fun onStart() {
//        Logger.i("LifeCycle: onStart")
//        super.onStart()
//    }
//
//    override fun onResume() {
//        Logger.e("LifeCycle: onResume")
//        super.onResume()
//    }
//
//    override fun onPause() {
//        Logger.i("LifeCycle: onPause")
//
//        super.onPause()
//    }
//
//    override fun onStop() {
//        Logger.i("LifeCycle: onStop")
//
//        super.onStop()
//    }
//
//    override fun onDestroy() {
//        Logger.i("LifeCycle: onDestroy")
//
//        super.onDestroy()
//    }

}


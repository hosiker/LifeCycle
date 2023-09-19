package com.companyname.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("Activity Life cycle","SecondActivity_onCreate")
    }

    override fun onStart(){
        super.onStart()
        Log.d("Activity Life cycle","SecondActivity_onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity Life cycle","SecondActivity_onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity Life cycle","SecondActivity_onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity Life cycle","SecondActivity_onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity Life cycle","SecondActivity_onDestory")
    }
}
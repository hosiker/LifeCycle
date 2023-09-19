package com.companyname.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onStart(){
        super.onStart()
        Log.d("SecondActivity","SecondActivity_onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity","SecondActivity_onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity","SecondActivity_onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity","SecondActivity_onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity","SecondActivity_onDestory")
    }
}
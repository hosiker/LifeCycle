package com.companyname.lifecycle

//Intent 사용 import
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//log 사용 import
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity","onCreate")


        val button1 = findViewById<View>(R.id.Activity_btn)

        button1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart(){
        super.onStart()
        Log.d("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestory")
    }
}
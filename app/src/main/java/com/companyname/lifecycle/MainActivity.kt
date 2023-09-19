package com.companyname.lifecycle

//Intent 사용 import
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//log 사용 import
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {

    private var exist = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Activity Life cycle", "MainActivity_onCreate")


        val button1 = findViewById<View>(R.id.Activity_btn)

        button1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<View>(R.id.AddFragment)
        val button3 = findViewById<View>(R.id.RemoveFragment)

        button2.setOnClickListener{
            if(!exist)
                addFragment()
        }

        button3.setOnClickListener {
            if(exist)
                removeFragment()
        }


    }

    private fun addFragment() {
        val fragment = BlankFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.framelayout, fragment)
            .addToBackStack(null)
            .commit()
        exist = true
    }

    private fun removeFragment() {
        val fragment = supportFragmentManager.findFragmentById(R.id.framelayout)
        if (fragment != null) {
            supportFragmentManager.beginTransaction()
                .remove(fragment)
                .commit()
            exist = false
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d("Activity Life cycle", "MainActivity_onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity Life cycle", "MainActivity_onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity Life cycle", "MainActivity_onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity Life cycle", "MainActivity_onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity Life cycle", "MainActivity_onDestory")
    }
}
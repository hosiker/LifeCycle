package com.companyname.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BlankFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Activity Life cycle", "Fragment_onCreate")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Activity Life cycle", "Fragment_onCreateView")
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Activity Life cycle", "Fragment_onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("Activity Life cycle", "Fragment_onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity Life cycle", "Fragment_onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity Life cycle", "Fragment_onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity Life cycle", "Fragment_onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity Life cycle", "Fragment_onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Activity Life cycle", "Fragment_onDestoryView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity Life cycle", "Fragment_onDestory")
    }
}
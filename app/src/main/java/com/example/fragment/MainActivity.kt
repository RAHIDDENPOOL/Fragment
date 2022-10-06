package com.example.fragment

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate?")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart?")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume?")
    }
}
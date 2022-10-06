package com.example.fragment

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.btnOne)
        val button2: Button = findViewById(R.id.btnTw)

        val firstFragment = PonasenkovFragment()
        val secondFragment = BlankFragment2()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frag, firstFragment)
            addToBackStack(null)
            commit()
        }
        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frag, firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frag, secondFragment)
                commit()
            }
        }


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
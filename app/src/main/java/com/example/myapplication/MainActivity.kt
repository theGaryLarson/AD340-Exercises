package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ourTextView: TextView = findViewById(R.id.textView)
        val button: TextView = findViewById(R.id.button1)
        val text = "Test message"
        val duration = Toast.LENGTH_LONG
        button.text = "Click Me!"
        val toast = Toast.makeText(applicationContext, text, duration)
        button.setOnClickListener {
            toast.show()
        }


    }
}
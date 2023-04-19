package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val increment: Button = findViewById(R.id.increment)
        val decrement: Button = findViewById(R.id.decrement)
        val reset: Button = findViewById(R.id.reset)
        val displayCount: TextView = findViewById(R.id.textView)
        displayCount.textSize = 48f
        var count = 0
        var message = ""
        val duration = Toast.LENGTH_SHORT
        increment.text = "Increment"
        decrement.text = "Decrement"
        reset.text = "Reset"
        val toast = Toast.makeText(applicationContext, message, duration)

        increment.setOnClickListener {
            toast.setText("Previous value: $count \nNext Value: ${++count + 1}")
            displayCount.text = count.toString()
            toast.show()
        }

        decrement.setOnClickListener {
            toast.setText("Previous value: $count \nNext Value: ${--count - 1}")
            displayCount.text = count.toString()
            toast.show()
        }
        reset.setOnClickListener{
            toast.setText("Previous value: $count \nNext Value: 0")
            displayCount.text = "0"
            count = 0
            toast.show()
        }


    }
}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val food: Button = findViewById(R.id.food)
        val touch: Button = findViewById(R.id.touch)
        val image: ImageView = findViewById(R.id.imageView)

        var message = ""
        val duration = Toast.LENGTH_SHORT
        food.text = "Food"
        touch.text = "Touch"
        val toast = Toast.makeText(applicationContext, message, duration)

        food.setOnClickListener {
            toast.setText("Good Person leave my food alone -,-")
            image.setImageResource(R.drawable.shiba_calm)
            toast.show()
        }

        touch.setOnClickListener {
            toast.setText("MINE! MINE! MINE! MINE!")
            image.setImageResource(R.drawable.angry_shiba)
            toast.show()
        }
    }
}
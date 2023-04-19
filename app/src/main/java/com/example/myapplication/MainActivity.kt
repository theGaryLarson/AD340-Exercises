package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: TextView = findViewById(R.id.startButton)
        val endButton: TextView = findViewById(R.id.endButton)
        val factText = "BC <3 Gini"
        val fictionText = "BC prefers cats over dogs"
        val duration = Toast.LENGTH_LONG
        startButton.text = "Get Fact"
        endButton.text = "Get Fiction"
        val factToast = Toast.makeText(applicationContext, factText, duration)
        val fictionToast = Toast.makeText(applicationContext, fictionText, duration)

        startButton.setOnClickListener {
            if (startButton.text == "Get Fact") {
                startButton.text = "Get Fiction"
                endButton.text = "Get Fact"
                factToast.show()

            } else {
                startButton.text = "Get Fact"
                endButton.text = "Get Fiction"
                fictionToast.show()

            }
        }

        endButton.setOnClickListener {
            if (endButton.text == "Get Fiction") {
                endButton.text = "Get Fact"
                startButton.text = "Get Fiction"
                fictionToast.show()

            } else {
                endButton.text = "Get Fiction"
                startButton.text = "Get Fact"
                factToast.show()
            }
        }


    }
}
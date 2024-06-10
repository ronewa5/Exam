package com.example.theweeklyweathercondition

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val Next = findViewById<Button>(R.id.btnCalculate)
        val Exit = findViewById<Button>(R.id.btnExit)

        Next?.setOnClickListener {
            val intent = Intent (this, MainActivity2::class.java)
            startActivity(intent)
        }

        }
    }

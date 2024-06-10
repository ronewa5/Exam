package com.example.theweeklyweathercondition

import android.annotation.SuppressLint
import android.content.Intent
import android.icu.util.IslamicCalendar.CalculationType
import android.media.ExifInterface
import android.os.Bundle
import android.telephony.TelephonyCallback.DataActivationStateListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.time.DayOfWeek

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val Display = findViewById<Button>(R.id.btnDisplay)
        val editTextArray1 = findViewById<EditText>(R.id.editTextArray1)
        val editTextArray2 = findViewById<EditText>(R.id.editTextArray2)
        val editTextArray3 = findViewById<EditText>(R.id.editTextArray2)
        val Calculate = findViewById<Button>(R.id.btnCalculate)
        val textViewResult = findViewById<TextView>(R.id.txtResults)
        val Exit  = findViewById<Button>(R.id.btnExit)

        //Declaration
        //Creating Weather Array


        Display?.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

            Calculate?.setOnClickListener {
                //collectData
            if (editTextArray1.text.toString().isEmpty()&& editTextArray2.text.toString().isEmpty()&& editTextArray3.text.toString().isEmpty()){
                //printlin("Please fill in")
                Toast.makeText(applicationContext, "Please fill in", Toast.LENGTH_SHORT).show()
            }else {
                editTextArray1.text.toString()
                editTextArray2.text.toString()
                editTextArray3.text.toString()

            }



        }

        }


            }
        }










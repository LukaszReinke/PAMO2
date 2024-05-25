package com.example.lab4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BmiActivity : AppCompatActivity() {
    private lateinit var weightInput: EditText
    private lateinit var heightInput: EditText
    private lateinit var calculateBmiButton: Button
    private lateinit var bmiResult: TextView
    private lateinit var chartBmiButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        weightInput = findViewById(R.id.weightInput)
        heightInput = findViewById(R.id.heightInput)
        calculateBmiButton = findViewById(R.id.calculateBmiButton)
        bmiResult = findViewById(R.id.bmiResult)
        chartBmiButton = findViewById(R.id.chartBmiButton)

        calculateBmiButton.setOnClickListener {
            calculateBmi()
        }

        chartBmiButton.setOnClickListener {
            startActivity(Intent(this, BmiChartActivity::class.java))
        }
    }

    private fun calculateBmi() {
        val weightStr = weightInput.text.toString()
        val heightStr = heightInput.text.toString()

        if (weightStr.isNotEmpty() && heightStr.isNotEmpty()) {
            val weight = weightStr.toFloat()
            val height = heightStr.toFloat() / 100
            val bmi = weight / (height * height)
            bmiResult.text = String.format("Twoje BMI: %.2f", bmi)
        }
    }
}
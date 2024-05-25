package com.example.lab4

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CaloriesActivity : AppCompatActivity() {
    private lateinit var weightInput: EditText
    private lateinit var heightInput: EditText
    private lateinit var ageInput: EditText
    private lateinit var calculateCaloriesButton: Button
    private lateinit var caloriesResult: TextView
    private lateinit var genderMale: RadioButton
    private lateinit var genderFemale: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calories)

        weightInput = findViewById(R.id.weightInput)
        heightInput = findViewById(R.id.heightInput)
        ageInput = findViewById(R.id.ageInput)
        calculateCaloriesButton = findViewById(R.id.calculateCaloriesButton)
        caloriesResult = findViewById(R.id.caloriesResult)
        genderMale = findViewById(R.id.maleRadio)
        genderFemale = findViewById(R.id.femaleRadio)

        calculateCaloriesButton.setOnClickListener {
            calculateCalories()
        }
    }

    private fun calculateCalories() {
        val weightStr = weightInput.text.toString()
        val heightStr = heightInput.text.toString()
        val ageStr = ageInput.text.toString()

        if (weightStr.isNotEmpty() && heightStr.isNotEmpty() && ageStr.isNotEmpty()) {
            val weight = weightStr.toFloat()
            val height = heightStr.toFloat()
            val age = ageStr.toInt()
            val bmr = if (genderMale.isChecked) {
                66 + (13.75 * weight) + (5 * height) - (6.75 * age)
            } else {
                655 + (9.56 * weight) + (1.85 * height) - (4.68 * age)
            }
            caloriesResult.text = String.format("Twoje dzienne zapotrzebowanie kaloryczne: %.2f kcal", bmr)
        }
    }
}

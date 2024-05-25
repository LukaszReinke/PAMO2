package com.example.lab4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private lateinit var bmiButton: Button
    private lateinit var caloriesButton: Button
    private lateinit var recipesButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        bmiButton = findViewById(R.id.bmiButton)
        caloriesButton = findViewById(R.id.caloriesButton)
        recipesButton = findViewById(R.id.recipesButton)

        bmiButton.setOnClickListener {
            startActivity(Intent(this, BmiActivity::class.java))
        }

        caloriesButton.setOnClickListener {
            startActivity(Intent(this, CaloriesActivity::class.java))
        }

        recipesButton.setOnClickListener {
            startActivity(Intent(this, RecipesActivity::class.java))
        }
    }
}

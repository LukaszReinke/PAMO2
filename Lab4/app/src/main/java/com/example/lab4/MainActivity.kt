package com.example.lab4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.bmiButton).setOnClickListener {
            startActivity(Intent(this, BmiActivity::class.java))
        }

        findViewById<Button>(R.id.caloriesButton).setOnClickListener {
            startActivity(Intent(this, CaloriesActivity::class.java))
        }

        findViewById<Button>(R.id.recipesButton).setOnClickListener {
            startActivity(Intent(this, RecipesActivity::class.java))
        }
    }
}
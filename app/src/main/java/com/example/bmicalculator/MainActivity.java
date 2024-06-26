/*
 Łukasz Reinke
 S15037
 Aplikacja mobilna, która realizuje funkcjonalności kalkulatora BMI.
 Dodane następujące testy:
 Analizę statyczną stworzonego kodu. Wynik wyeksportowany do pliku index.html.
 Testy jednostkowe z JUnit.
 Testy Espresso.
*/

package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button bmiButton, caloriesButton, recipesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmiButton = findViewById(R.id.bmiButton);
        caloriesButton = findViewById(R.id.caloriesButton);
        recipesButton = findViewById(R.id.recipesButton);

        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BmiActivity.class);
                startActivity(intent);
            }
        });

        caloriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CaloriesActivity.class);
                startActivity(intent);
            }
        });

        recipesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecipesActivity.class);
                startActivity(intent);
            }
        });
    }
}

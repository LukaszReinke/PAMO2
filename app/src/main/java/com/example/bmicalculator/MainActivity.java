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

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText weightEditNumber;
    private EditText heightEditNumber;
    private TextView bmiTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditNumber = findViewById(R.id.weightTextNumber);
        heightEditNumber = findViewById(R.id.heightTextNumber);
        bmiTextView = findViewById(R.id.bmiTextView);
        calculateButtonListener();
    }

    public void calculateButtonListener(){
        Button button = findViewById(R.id.calculateBMIButton);
        button.setOnClickListener(v -> {
            String heightString = heightEditNumber.getText().toString();
            String weightString = weightEditNumber.getText().toString();
            double height = Double.parseDouble(heightString) / 100;
            double weight = Double.parseDouble(weightString);
            double bmi = BMICalculator.calculateBMI(weight, height);
            DecimalFormat df = new DecimalFormat("#.#");
            bmiTextView.setText(df.format(bmi));
        });
    }
}

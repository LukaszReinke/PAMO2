package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CaloriesActivity extends AppCompatActivity {
    private EditText ageInput, weightInput, heightInput;
    private RadioGroup genderGroup;
    private Button calculateCaloriesButton;
    private TextView caloriesResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);

        ageInput = findViewById(R.id.ageInput);
        weightInput = findViewById(R.id.weightInput);
        heightInput = findViewById(R.id.heightInput);
        genderGroup = findViewById(R.id.genderGroup);
        calculateCaloriesButton = findViewById(R.id.calculateCaloriesButton);
        caloriesResult = findViewById(R.id.caloriesResult);

        calculateCaloriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCalories();
            }
        });
    }

    private void calculateCalories() {
        String ageStr = ageInput.getText().toString();
        String weightStr = weightInput.getText().toString();
        String heightStr = heightInput.getText().toString();
        int selectedGenderId = genderGroup.getCheckedRadioButtonId();

        if (!ageStr.isEmpty() && !weightStr.isEmpty() && !heightStr.isEmpty() && selectedGenderId != -1) {
            int age = Integer.parseInt(ageStr);
            float weight = Float.parseFloat(weightStr);
            float height = Float.parseFloat(heightStr);
            boolean isMale = selectedGenderId == R.id.maleRadio;

            double bmr;
            if (isMale) {
                bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
            } else {
                bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
            }

            caloriesResult.setText(String.format("Twoje dzienne zapotrzebowanie kaloryczne: %.2f", bmr));
        }
    }
}

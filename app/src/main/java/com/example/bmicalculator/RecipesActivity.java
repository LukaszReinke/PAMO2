package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RecipesActivity extends AppCompatActivity {
    private Button recipe1Button, recipe2Button;
    private TextView recipeDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        recipe1Button = findViewById(R.id.recipe1Button);
        recipe2Button = findViewById(R.id.recipe2Button);
        recipeDetails = findViewById(R.id.recipeDetails);

        recipe1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRecipe1();
            }
        });

        recipe2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRecipe2();
            }
        });
    }

    private void showRecipe1() {
        String recipe1 = "Przepis 1: Sałatka z kurczakiem\n" +
                "Składniki:\n" +
                "- 200g piersi z kurczaka\n" +
                "- 1 ogórek\n" +
                "- 1 pomidor\n" +
                "- 50g sera feta\n" +
                "- 2 łyżki oliwy z oliwek\n" +
                "- Sól, pieprz do smaku\n\n" +
                "Przygotowanie:\n" +
                "1. Kurczaka pokrój w kostkę i usmaż na patelni.\n" +
                "2. Ogórek i pomidor pokrój w kostkę.\n" +
                "3. Wymieszaj wszystkie składniki z oliwą z oliwek.\n" +
                "4. Dopraw solą i pieprzem do smaku.";

        recipeDetails.setText(recipe1);
    }

    private void showRecipe2() {
        String recipe2 = "Przepis 2: Smoothie owocowe\n" +
                "Składniki:\n" +
                "- 1 banan\n" +
                "- 1 pomarańcza\n" +
                "- 100g truskawek\n" +
                "- 200ml jogurtu naturalnego\n\n" +
                "Przygotowanie:\n" +
                "1. Banana, pomarańcze i truskawki pokrój na mniejsze kawałki.\n" +
                "2. Wszystkie składniki wrzuć do blendera.\n" +
                "3. Zmiksuj na gładką masę.";

        recipeDetails.setText(recipe2);
    }
}

package com.example.lab4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RecipesActivity : AppCompatActivity() {
    private lateinit var recipeDetails: TextView
    private lateinit var showRecipe1Button: Button
    private lateinit var showRecipe2Button: Button
    private lateinit var shoppingListButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes)

        recipeDetails = findViewById(R.id.recipeDetails)
        showRecipe1Button = findViewById(R.id.recipe1Button)
        showRecipe2Button = findViewById(R.id.recipe2Button)
        shoppingListButton = findViewById(R.id.shoppingListButton)
        shoppingListButton.visibility = View.INVISIBLE

        showRecipe1Button.setOnClickListener {
            showRecipe1()
            shoppingListButton.visibility = View.VISIBLE
        }

        showRecipe2Button.setOnClickListener {
            showRecipe2()
            shoppingListButton.visibility = View.VISIBLE
        }

        shoppingListButton.setOnClickListener {
            startActivity(Intent(this, ShoppingListActivity::class.java))
        }
    }

    private fun showRecipe1() {
        val recipe1 = """
            Przepis 1:
            Składniki:
            - 2 jajka
            - 1 banan
            - 100g płatków owsianych

            Przygotowanie:
            1. Jajka wbij do miski.
            2. Dodaj pokrojonego banana i płatki owsiane.
            3. Zmiksuj wszystko na gładką masę i smaż na rozgrzanej patelni.
        """.trimIndent()
        recipeDetails.text = recipe1
    }

    private fun showRecipe2() {
        val recipe2 = """
            Przepis 2:
            Składniki:
            - 1 banan
            - 1 pomarańcza
            - 100g truskawek
            - 200ml jogurtu naturalnego

            Przygotowanie:
            1. Banana, pomarańcze i truskawki pokrój na mniejsze kawałki.
            2. Wszystkie składniki wrzuć do blendera.
            3. Zmiksuj na gładką masę.
        """.trimIndent()
        recipeDetails.text = recipe2
    }
}

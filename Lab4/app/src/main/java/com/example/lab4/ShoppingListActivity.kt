package com.example.lab4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShoppingListActivity : AppCompatActivity() {
    private lateinit var shoppingListRecyclerView: RecyclerView
    private lateinit var shoppingListAdapter: ShoppingListAdapter
    private val shoppingList = mutableListOf(
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_list)

        shoppingListRecyclerView = findViewById(R.id.shoppingListRecyclerView)
        shoppingListRecyclerView.layoutManager = LinearLayoutManager(this)
        shoppingListAdapter = ShoppingListAdapter(shoppingList)
        shoppingListRecyclerView.adapter = shoppingListAdapter
    }
}

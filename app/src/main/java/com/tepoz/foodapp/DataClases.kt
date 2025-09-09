package com.tepoz.foodapp
import com.tepoz.foodapp.R
data class Category(
    val id: Int,
    val name: String,
    val drawableRes: Int
)

data class Restaurant(
    val id: Int,
    val name: String,
    val drawableRes: Int
)

data class Food(
    val id: Int,
    val name: String,
    val drawableRes: Int,
    val rating: Double,
    val price: String
)

val categories = listOf(
    Category(1, "Pizza", R.drawable.pizza),
    Category(2, "Burger", R.drawable.fast_food),
    Category(3, "Hot Dog", R.drawable.japanese),
    Category(4, "Drink", R.drawable.mexican),
    Category(5, "Donut", R.drawable.fast_food)
)

val restaurants = listOf(
    Restaurant(1, "Restaurante 1", R.drawable.italian),
    Restaurant(2, "Restaurante 2", R.drawable.italian),
    Restaurant(3, "Restaurante 3", R.drawable.italian),
    Restaurant(4, "Restaurante 4", R.drawable.italian)
)

val foods = listOf(
    Food(1, "Pizza Pepperoni", R.drawable.japanese, 4.5, "$12.99"),
    Food(2, "Burger Clásica", R.drawable.japanese, 4.0, "$9.99"),
    Food(3, "Hot Dog Especial", R.drawable.japanese, 4.2, "$7.99"),
    Food(4, "Sushi Variado", R.drawable.japanese, 4.8, "$15.99"),
    Food(5, "Taco Mexicano", R.drawable.japanese, 4.3, "$8.99"),
    Food(6, "Donut Glaseado", R.drawable.japanese, 4.1, "$3.99")
)
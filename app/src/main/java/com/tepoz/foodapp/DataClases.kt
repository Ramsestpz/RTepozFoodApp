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
    Category(2, "Burger", R.drawable.burger),
    Category(3, "Hot Dog", R.drawable.dog),
    Category(4, "Drink", R.drawable.drink),
    Category(5, "Donut", R.drawable.donut)
)

val restaurants = listOf(
    Restaurant(1, "Krispy Cream", R.drawable.cream),
    Restaurant(2, "Burger King", R.drawable.king),
    Restaurant(3, "McDonald's", R.drawable.mcdonalds),
    Restaurant(4, "Taco Bell", R.drawable.taco),
    Restaurant(5, "Subway", R.drawable.subway)
)

val foods = listOf(
    Food(1, "Pizza Pepperoni", R.drawable.peperoni, 4.5, "$12.99"),
    Food(2, "Burger Clásica", R.drawable.burger, 4.0, "$9.99"),
    Food(3, "Hot Dog Especial", R.drawable.dog, 4.2, "$7.99"),
    Food(4, "Sushi Variado", R.drawable.shi, 4.8, "$15.99"),
    Food(5, "Taco Mexicano", R.drawable.tacosss, 4.3, "$8.99"),
    Food(6, "Donut Glaseado", R.drawable.dona, 4.1, "$3.99")
)
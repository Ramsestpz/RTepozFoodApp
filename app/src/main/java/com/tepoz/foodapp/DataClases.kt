package com.tepoz.foodapp

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
    Category(1, "Pizza", R.drawable.italian),
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
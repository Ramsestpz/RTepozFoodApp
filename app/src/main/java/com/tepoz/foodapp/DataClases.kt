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

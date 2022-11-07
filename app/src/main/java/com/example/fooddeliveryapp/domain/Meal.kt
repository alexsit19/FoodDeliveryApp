package com.example.fooddeliveryapp.domain

data class Meal(
    val id: Long,
    val title: String,
    val instruction: String,
    val country: String,
    val mealImageUrl: String
    )
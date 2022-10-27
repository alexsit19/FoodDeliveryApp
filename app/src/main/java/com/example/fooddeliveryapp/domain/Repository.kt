package com.example.fooddeliveryapp.domain

interface Repository {
    suspend fun getMeals(category: String): List<Meal>

    suspend fun getMeal(id: Long): Meal

}
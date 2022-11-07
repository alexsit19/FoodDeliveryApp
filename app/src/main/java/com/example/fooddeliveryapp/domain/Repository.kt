package com.example.fooddeliveryapp.domain

interface Repository {
    suspend fun getMeals(category: String): List<Meal>

    suspend fun getMeal(id: Long): Meal

    suspend fun addToFavorite(meal: Meal)

    suspend fun deleteFromFavorite(meal: Meal)

    suspend fun getMealsFromFavorite(): List<Meal>
}
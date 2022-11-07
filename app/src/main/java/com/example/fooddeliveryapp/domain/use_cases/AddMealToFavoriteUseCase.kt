package com.example.fooddeliveryapp.domain.use_cases

import com.example.fooddeliveryapp.domain.Meal
import com.example.fooddeliveryapp.domain.Repository

class AddMealToFavoriteUseCase(private val repository: Repository) {
    suspend operator fun invoke(meal: Meal) = repository.addToFavorite(meal)
}
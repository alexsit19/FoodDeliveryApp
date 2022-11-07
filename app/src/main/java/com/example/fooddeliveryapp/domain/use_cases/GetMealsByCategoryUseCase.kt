package com.example.fooddeliveryapp.domain.use_cases

import com.example.fooddeliveryapp.domain.Repository

class GetMealsByCategoryUseCase(private val repository: Repository) {
    suspend operator fun invoke(category: String) = repository.getMeals(category)
}
package com.example.fooddeliveryapp.domain.use_cases

import com.example.fooddeliveryapp.domain.Repository

class GetMealsFromFavoriteUseCase(private val repository: Repository) {
    suspend operator fun invoke() = repository.getMealsFromFavorite()

}
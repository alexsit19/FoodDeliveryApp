package com.example.fooddeliveryapp.domain.use_cases

import com.example.fooddeliveryapp.domain.Repository

class GetMealByIdUseCase(private val repository: Repository) {
    suspend operator fun invoke(id: Long) = repository.getMeal(id)
}
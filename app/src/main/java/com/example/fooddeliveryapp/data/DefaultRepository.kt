package com.example.fooddeliveryapp.data

import com.example.fooddeliveryapp.data.model.MealApiResponse
import com.example.fooddeliveryapp.data.remote.MealApi
import com.example.fooddeliveryapp.domain.Meal
import com.example.fooddeliveryapp.domain.Repository

class DefaultRepository : Repository {

    override suspend fun getMeals(category: String): List<Meal> {
        val response: MealApiResponse = MealApi.retrofitService.getMealsByCategory(category)
        return emptyList()
    }

    override suspend fun getMeal(id: Long): Meal {
        return Meal(1, "", "", "")
    }


}
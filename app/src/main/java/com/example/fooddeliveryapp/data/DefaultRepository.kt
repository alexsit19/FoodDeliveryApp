package com.example.fooddeliveryapp.data

import com.example.fooddeliveryapp.data.remote.MealApi
import com.example.fooddeliveryapp.domain.Meal
import com.example.fooddeliveryapp.domain.Repository

class DefaultRepository : Repository {

    override suspend fun getMeals(category: String): List<Meal> {
        var meals: List<Meal> = emptyList()
        try {
            val response = MealApi.retrofitService.getMealsByCategory(category)
            if (response.isSuccessful) {
                meals = response.body()?.meals?.map { it.toMeal() } as List
            }
        } catch (e: Exception) {
            //todo обработать ошибки
        }
        return meals
    }

    override suspend fun getMeal(id: Long): Meal {

        try {
            val response = MealApi.retrofitService.getMealById(id)
            if (response.isSuccessful) {
              val  meal = response.body()?.meals?.map { it.toMeal() }?.first() as Meal
            }
        } catch (e: Exception) {

        }
        return meal
    }

    override suspend fun addToFavorite(meal: Meal) {
        //TODO("Not yet implemented")
    }

    override suspend fun deleteFromFavorite(meal: Meal) {
        //TODO("Not yet implemented")
    }

    override suspend fun getMealsFromFavorite(): List<Meal> {
        //TODO("Not yet implemented")
    }


}
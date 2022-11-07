package com.example.fooddeliveryapp.data.remote

import com.example.fooddeliveryapp.data.model.MealApiResponse
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

private const val TIMEOUT = 5L
private const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"

interface MealApiService {

    @GET("filter.php")
    suspend fun getMealsByCategory(@Query("c") category: String): Response<MealApiResponse>

    @GET("lookup.php")
    suspend fun getMealById(@Query("i") id: Long): Response<MealApiResponse>

}

object MealApi {

    private val interceptor = HttpLoggingInterceptor()
    private val client = OkHttpClient.Builder()
        .addInterceptor(interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC))
        .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
        .readTimeout(TIMEOUT, TimeUnit.SECONDS)
        .build()
    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .client(client)
        .build()

    val retrofitService: MealApiService by lazy {
        retrofit.create(MealApiService::class.java)
    }
}
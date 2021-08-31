package com.kromer.data.sources.remote

import com.kromer.data.models.NutritionResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NutritionApiInterface {
    @GET("nutrition-data")
    suspend fun getNutritionData(@Query("ingr") ingredient: String): NutritionResponse
}
package com.kromer.data.sources.remote

import com.kromer.data.models.NutritionResponse
import com.kromer.domain.models.NutritionRequest

class NutritionRemoteDataSourceImpl(private val nutritionApiInterface: NutritionApiInterface) :
    NutritionRemoteDataSource {
    override suspend fun getNutritionData(request: NutritionRequest): NutritionResponse =
        nutritionApiInterface.getNutritionData(request.ingredient)
}
package com.kromer.data.sources.remote

import com.kromer.data.models.NutritionResponse
import com.kromer.domain.models.NutritionRequest

interface NutritionRemoteDataSource {
    suspend fun getNutritionData(request: NutritionRequest): NutritionResponse
}
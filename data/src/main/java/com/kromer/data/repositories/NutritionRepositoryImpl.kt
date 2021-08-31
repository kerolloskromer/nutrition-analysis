package com.kromer.data.repositories

import com.kromer.data.mappers.ObjectMapper.toNutrition
import com.kromer.data.sources.remote.NutritionRemoteDataSource
import com.kromer.domain.models.Nutrition
import com.kromer.domain.models.NutritionRequest
import com.kromer.domain.repositories.NutritionRepository

class NutritionRepositoryImpl(
    private val remoteDataSource: NutritionRemoteDataSource,
) :
    NutritionRepository {
    override suspend fun getNutritionData(request: NutritionRequest): Nutrition =
        remoteDataSource.getNutritionData(request).toNutrition()
}
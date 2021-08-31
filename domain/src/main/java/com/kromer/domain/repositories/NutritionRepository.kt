package com.kromer.domain.repositories

import com.kromer.domain.models.Nutrition
import com.kromer.domain.models.NutritionRequest

interface NutritionRepository {
    suspend fun getNutritionData(request: NutritionRequest): Nutrition
}
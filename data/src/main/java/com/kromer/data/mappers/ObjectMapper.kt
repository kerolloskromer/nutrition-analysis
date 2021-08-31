package com.kromer.data.mappers

import com.kromer.data.models.NutritionResponse
import com.kromer.domain.models.Nutrition

object ObjectMapper {
    // TODO complete mapper impl
    fun NutritionResponse.toNutrition() = Nutrition(
        text = "Calories = $calories \nTotalWeight = $totalWeight"
    )
}
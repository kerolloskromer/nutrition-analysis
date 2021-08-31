package com.kromer.domain.usecases

import com.kromer.domain.models.Nutrition
import com.kromer.domain.models.NutritionRequest
import com.kromer.domain.repositories.NutritionRepository
import com.kromer.domain.usecases.base.UseCase
import com.kromer.domain.utils.Resource
import com.kromer.domain.utils.ValidationError

class GetNutritionDataUseCase(private val repository: NutritionRepository) :
    UseCase<Resource<Nutrition>, NutritionRequest> {
    override suspend fun call(params: NutritionRequest): Resource<Nutrition> {
        return if (params.ingredient.isEmpty()) {
            Resource.error(message = null, ValidationError.EMPTY_INGREDIENT)
        } else {
            try {
                Resource.success(repository.getNutritionData(params))
            } catch (exception: Exception) {
                Resource.error(message = exception.message, validationError = null)
            }
        }
    }
}
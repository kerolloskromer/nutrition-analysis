package com.kromer.presentation.features.analyze

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kromer.domain.models.Nutrition
import com.kromer.domain.models.NutritionRequest
import com.kromer.domain.usecases.GetNutritionDataUseCase
import com.kromer.domain.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class AnalyzeViewModel @Inject constructor(
    private val getNutritionDataUseCase: GetNutritionDataUseCase,
) : ViewModel() {

    var ingredient: String = ""

    private val _data = MutableLiveData<Resource<Nutrition>>()
    val data: LiveData<Resource<Nutrition>> = _data

    private fun getNutritionData() {
        viewModelScope.launch {
            _data.value = getNutritionDataUseCase.call(NutritionRequest(ingredient))
        }
    }

    fun onAnalyzeClick() {
        getNutritionData()
    }
}
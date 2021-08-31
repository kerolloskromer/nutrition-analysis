package com.kromer.data.models

import com.google.gson.annotations.SerializedName

data class NutritionResponse(
    @SerializedName("calories")
    val calories: Int,
    @SerializedName("cautions")
    val cautions: List<Caution>,
    @SerializedName("dietLabels")
    val dietLabels: List<String>,
    @SerializedName("healthLabels")
    val healthLabels: List<String>,
    @SerializedName("totalDaily")
    val totalDaily: TotalDaily,
    @SerializedName("totalNutrients")
    val totalNutrients: TotalNutrients,
    @SerializedName("totalNutrientsKCal")
    val totalNutrientsKCal: TotalNutrientsKCal,
    @SerializedName("totalWeight")
    val totalWeight: Int,
    @SerializedName("uri")
    val uri: String
)

class Caution(
)

class TotalDaily(
)

class TotalNutrients(
)

data class TotalNutrientsKCal(
    @SerializedName("CHOCDF_KCAL")
    val chocdfKcal: NutrientsKCal,
    @SerializedName("ENERC_KCAL")
    val enerecKcal: NutrientsKCal,
    @SerializedName("FAT_KCAL")
    val fatKcal: NutrientsKCal,
    @SerializedName("PROCNT_KCAL")
    val procntKcal: NutrientsKCal
)

data class NutrientsKCal(
    @SerializedName("label")
    val label: String,
    @SerializedName("quantity")
    val quantity: Int,
    @SerializedName("unit")
    val unit: String
)
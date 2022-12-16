package uz.lutfullayevmuhammad.lesson63.core.models.priceBreakdown


import com.google.gson.annotations.SerializedName

data class PriceBreakdownResponse(
    @SerializedName("ingredients")
    val ingredients: List<Ingredient>,
    @SerializedName("totalCost")
    val totalCost: Double,
    @SerializedName("totalCostPerServing")
    val totalCostPerServing: Int
)
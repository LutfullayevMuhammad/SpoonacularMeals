package uz.lutfullayevmuhammad.lesson63.core.models.priceBreakdown


import com.google.gson.annotations.SerializedName

data class Ingredient(
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("amount")
    val amount: Amount
)
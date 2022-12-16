package uz.lutfullayevmuhammad.lesson63.core.models.priceBreakdown


import com.google.gson.annotations.SerializedName

data class Us(
    @SerializedName("value")
    val value: Double,
    @SerializedName("unit")
    val unit: String
)
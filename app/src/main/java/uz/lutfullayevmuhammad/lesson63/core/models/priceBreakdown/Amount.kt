package uz.lutfullayevmuhammad.lesson63.core.models.priceBreakdown


import com.google.gson.annotations.SerializedName

data class Amount(
    @SerializedName("metric")
    val metric: Metric,
    @SerializedName("us")
    val us: Us
)
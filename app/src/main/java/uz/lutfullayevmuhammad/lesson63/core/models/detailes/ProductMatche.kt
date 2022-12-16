package uz.lutfullayevmuhammad.lesson63.core.models.detailes


import com.google.gson.annotations.SerializedName

data class ProductMatche(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("averageRating")
    val averageRating: Double,
    @SerializedName("ratingCount")
    val ratingCount: Int,
    @SerializedName("score")
    val score: Double,
    @SerializedName("link")
    val link: String
)
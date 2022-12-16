package uz.lutfullayevmuhammad.lesson63.core.models.search


import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("results")
    val results: ArrayList<Result>,
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("number")
    val number: Int,
    @SerializedName("totalResults")
    val totalResults: Int
)
package uz.lutfullayevmuhammad.lesson63.core.models.detailes


import com.google.gson.annotations.SerializedName

data class DetailesResponse(
    @SerializedName("vegetarian")
    val vegetarian: Boolean,
    @SerializedName("vegan")
    val vegan: Boolean,
    @SerializedName("glutenFree")
    val glutenFree: Boolean,
    @SerializedName("dairyFree")
    val dairyFree: Boolean,
    @SerializedName("veryHealthy")
    val veryHealthy: Boolean,
    @SerializedName("cheap")
    val cheap: Boolean,
    @SerializedName("veryPopular")
    val veryPopular: Boolean,
    @SerializedName("sustainable")
    val sustainable: Boolean,
    @SerializedName("lowFodmap")
    val lowFodmap: Boolean,
    @SerializedName("weightWatcherSmartPoints")
    val weightWatcherSmartPoints: Int,
    @SerializedName("gaps")
    val gaps: String,
    @SerializedName("preparationMinutes")
    val preparationMinutes: Int,
    @SerializedName("cookingMinutes")
    val cookingMinutes: Int,
    @SerializedName("aggregateLikes")
    val aggregateLikes: Int,
    @SerializedName("healthScore")
    val healthScore: Int,
    @SerializedName("creditsText")
    val creditsText: String,
    @SerializedName("sourceName")
    val sourceName: String,
    @SerializedName("pricePerServing")
    val pricePerServing: Double,
    @SerializedName("extendedIngredients")
    val extendedIngredients: ArrayList<ExtendedIngredient>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("readyInMinutes")
    val readyInMinutes: Int,
    @SerializedName("servings")
    val servings: Int,
    @SerializedName("sourceUrl")
    val sourceUrl: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("imageType")
    val imageType: String,
    @SerializedName("summary")
    val summary: String,
    @SerializedName("cuisines")
    val cuisines: List<String>,
    @SerializedName("dishTypes")
    val dishTypes: List<String>,
    @SerializedName("diets")
    val diets: List<String>,
    @SerializedName("occasions")
    val occasions: List<Any>,
    @SerializedName("winePairing")
    val winePairing: WinePairing,
    @SerializedName("instructions")
    val instructions: Any,
    @SerializedName("analyzedInstructions")
    val analyzedInstructions: List<Any>,
    @SerializedName("originalId")
    val originalId: Any
)
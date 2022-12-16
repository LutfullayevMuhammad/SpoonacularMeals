package uz.lutfullayevmuhammad.lesson63.core.apiimport retrofit2.Responseimport retrofit2.http.GETimport retrofit2.http.Pathimport retrofit2.http.Queryimport uz.lutfullayevmuhammad.lesson63.core.models.detailes.DetailesResponseimport uz.lutfullayevmuhammad.lesson63.core.models.search.SearchResponseinterface SpoonacularApi {    @GET("recipes/complexSearch")    suspend fun searchRecipe(        @Query("query") q:String,        @Query("apiKey") apiKey:String    ): Response<SearchResponse?>    @GET("recipes/{id}/information")    suspend fun detailsApi(        @Path("id")id:String,        @Query("apiKey")apiKey: String    ): Response<DetailesResponse?>}
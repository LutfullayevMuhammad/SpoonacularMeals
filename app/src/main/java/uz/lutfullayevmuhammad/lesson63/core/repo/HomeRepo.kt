package uz.lutfullayevmuhammad.lesson63.core.repoimport kotlinx.coroutines.Dispatchersimport uz.lutfullayevmuhammad.lesson63.core.api.SpoonacularApiimport uz.lutfullayevmuhammad.lesson63.core.helper.ResultWrapperimport uz.lutfullayevmuhammad.lesson63.core.helper.parseResponseimport uz.lutfullayevmuhammad.lesson63.core.models.detailes.DetailesResponseimport uz.lutfullayevmuhammad.lesson63.core.models.error.UniversalErrorimport uz.lutfullayevmuhammad.lesson63.core.models.search.SearchResponseimport javax.inject.Injectclass HomeRepo @Inject constructor(private val api: SpoonacularApi) {    suspend fun searchData(q: String): ResultWrapper<SearchResponse?, UniversalError?> {        return parseResponse(Dispatchers.IO) {            api.searchRecipe(q, "5c46858517eb437c866de7e5cbab197b")        }    }    suspend fun detailsData(id: String): ResultWrapper<DetailesResponse?, UniversalError?> {        return parseResponse(Dispatchers.IO) {            api.detailsApi(id, "5c46858517eb437c866de7e5cbab197b")        }    }}
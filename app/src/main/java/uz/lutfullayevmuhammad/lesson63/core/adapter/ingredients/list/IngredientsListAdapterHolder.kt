package uz.lutfullayevmuhammad.lesson63.core.adapter.ingredients.list

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import coil.load
import uz.lutfullayevmuhammad.lesson63.core.models.detailes.ExtendedIngredient
import uz.lutfullayevmuhammad.lesson63.databinding.ItemIngredientsListBinding

class IngredientsListAdapterHolder(val binding: ItemIngredientsListBinding) : RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("SetTextI18n")
    fun bindData(data: ExtendedIngredient) {
        binding.ingredientsImage.load("https://spoonacular.com/cdn/ingredients_250x250/"+data.image)
        binding.ingredientsAmount.text = "${data.measures.metric.amount} ${data.measures.metric.unitShort}"
        binding.ingredientsName.text = data.name
    }

}
package uz.lutfullayevmuhammad.lesson63.core.adapter.search

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import coil.load
import uz.lutfullayevmuhammad.lesson63.databinding.ItemSearchBinding

class SearchMealsAdapterHolder( val binding: ItemSearchBinding) : RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("SetTextI18n")
    fun bindData(data: uz.lutfullayevmuhammad.lesson63.core.models.search.Result) {
        binding.mealImage.load(data.image)
        binding.title.text = data.title
    }

}
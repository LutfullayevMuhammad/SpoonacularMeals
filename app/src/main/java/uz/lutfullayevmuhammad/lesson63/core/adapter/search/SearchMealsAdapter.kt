package uz.lutfullayevmuhammad.lesson63.core.adapter.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.lutfullayevmuhammad.lesson63.databinding.ItemSearchBinding

class SearchMealsAdapter : RecyclerView.Adapter<SearchMealsAdapterHolder>() {

    var data = ArrayList<uz.lutfullayevmuhammad.lesson63.core.models.search.Result>()
        set(value) {
            field.addAll(value)
            notifyItemRangeInserted(data.size - value.size, value.size)
        }
    var onScrollEnd: (() -> Unit)? = null

    var onItemClick: ((result: uz.lutfullayevmuhammad.lesson63.core.models.search.Result) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchMealsAdapterHolder =
        SearchMealsAdapterHolder(
            ItemSearchBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: SearchMealsAdapterHolder, position: Int) {
        holder.bindData(data = data[position])
        if (position == data.size - 1) {
            onScrollEnd?.invoke()
        }

        holder.binding.root.setOnClickListener {
            onItemClick?.invoke(data[position])
        }
    }

    override fun getItemCount(): Int = data.size

}
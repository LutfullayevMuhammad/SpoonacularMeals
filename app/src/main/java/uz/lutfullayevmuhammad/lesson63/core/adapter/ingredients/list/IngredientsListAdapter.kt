package uz.lutfullayevmuhammad.lesson63.core.adapter.ingredients.list

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.lutfullayevmuhammad.lesson63.core.models.detailes.ExtendedIngredient
import uz.lutfullayevmuhammad.lesson63.databinding.ItemIngredientsListBinding

class IngredientsListAdapter : RecyclerView.Adapter<IngredientsListAdapterHolder>() {

    var data = ArrayList<ExtendedIngredient>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            data.clear()
            data.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientsListAdapterHolder =
        IngredientsListAdapterHolder(
            ItemIngredientsListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: IngredientsListAdapterHolder, position: Int) {
        holder.bindData(data = data[position])
    }

    override fun getItemCount(): Int = data.size

}
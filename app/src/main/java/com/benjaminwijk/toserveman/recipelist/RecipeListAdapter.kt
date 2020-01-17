package com.benjaminwijk.toserveman.recipelist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.benjaminwijk.toserveman.R
import com.benjaminwijk.toserveman.model.Recipe
import kotlinx.android.synthetic.main.recipe_list_item.view.*

class RecipeListAdapter(val recipes: ArrayList<Recipe>, val context: Context) :
    RecyclerView.Adapter<RecipeListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.recipe_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return recipes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipe = recipes.get(position)

        holder.name.text = recipe.name
        holder.description.text = recipe.description
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.recipe_item_name
        val description: TextView = view.recipe_item_short_description
    }
}
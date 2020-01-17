package com.benjaminwijk.toserveman.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.benjaminwijk.toserveman.model.Recipe

object RecipeListModel : ViewModel() {

    val list = MutableLiveData<ArrayList<Recipe>>()

    init {
        list.value = ArrayList()
        list.value!!.add(Recipe("Chicken Parmesan", "Tasty tasty!"))
    }

    //Add blank recipe
    fun addRecipe(recipe: Recipe) : Recipe {
        list.value?.add(recipe)
        list.postValue(list.value)

        return recipe
    }
}
package com.benjaminwijk.toserveman.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.benjaminwijk.toserveman.model.Ingredient
import com.benjaminwijk.toserveman.model.Recipe

object EditRecipeModel : ViewModel(){

    val name = MutableLiveData<String>()
    val description = MutableLiveData<String>()
    val ingredients = MutableLiveData<ArrayList<Ingredient>>()
    val instructions = MutableLiveData<ArrayList<String>>()

    init {
        clear()
    }

    fun createRecipe() : Recipe{
        return Recipe(
            name.value!!,
            description.value!!,
            ingredients.value!!,
            instructions.value!!
        )
    }

    //Also used for init
    fun clear(){
        name.value = ""
        description.value = ""
        ingredients.value = ArrayList()
        instructions.value = ArrayList()
    }

}
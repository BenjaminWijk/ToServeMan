package com.benjaminwijk.toserveman.model

data class Recipe (
    var name: String = "",
    var description: String = "",
    var ingredients: ArrayList<Ingredient> = ArrayList(),
    var instructions: ArrayList<String> = ArrayList()
)

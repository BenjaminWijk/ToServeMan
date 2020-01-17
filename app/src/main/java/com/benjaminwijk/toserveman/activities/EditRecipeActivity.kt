package com.benjaminwijk.toserveman.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.benjaminwijk.toserveman.R
import com.benjaminwijk.toserveman.databinding.ActivityEditRecipeBinding
import com.benjaminwijk.toserveman.viewmodels.EditRecipeModel
import com.benjaminwijk.toserveman.viewmodels.RecipeListModel

class EditRecipeActivity : AppCompatActivity() {

    val model = EditRecipeModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityEditRecipeBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_edit_recipe)

        binding.lifecycleOwner = this
        binding.model = model
    }

    fun onSaveRecipe(view: View){
        //TODO do this in a different way? (intent or something).
        //TODO Should probably not have access to another fragment's viewmodel
        RecipeListModel.addRecipe(model.createRecipe())

        model.clear()

        finish()
    }

}
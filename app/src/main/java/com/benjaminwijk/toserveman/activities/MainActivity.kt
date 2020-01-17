package com.benjaminwijk.toserveman.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.benjaminwijk.toserveman.R
import com.benjaminwijk.toserveman.recipelist.RecipeListFragment
import com.benjaminwijk.toserveman.viewmodels.RecipeListModel

class MainActivity : AppCompatActivity() {

    lateinit var recipeListModel: RecipeListModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recipeListModel = RecipeListModel

        supportFragmentManager.beginTransaction()
            .replace(R.id.recipe_list_fragment, RecipeListFragment()).commit()
    }

    fun openNewRecipe(view: View) {
        val intent = Intent(this, EditRecipeActivity::class.java)
        startActivity(intent)
    }
}

package com.benjaminwijk.toserveman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benjaminwijk.toserveman.recipelist.RecipeListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.recipe_list_fragment, RecipeListFragment()).commit()
    }
}

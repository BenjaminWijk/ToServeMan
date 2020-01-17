package com.benjaminwijk.toserveman.recipelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.benjaminwijk.toserveman.R
import com.benjaminwijk.toserveman.databinding.RecipeListFragmentBinding
import com.benjaminwijk.toserveman.viewmodels.RecipeListModel

class RecipeListFragment : Fragment() {

    lateinit var model : RecipeListModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = RecipeListFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        model = RecipeListModel
        binding.model = model

        val recipeListAdapter = RecipeListAdapter(model.list.value!!, binding.root.context)

        val recipeListView = binding.root.findViewById<RecyclerView>(R.id.recipe_list)
        recipeListView.layoutManager = GridLayoutManager(activity, 2)
        recipeListView.adapter = recipeListAdapter

        model.list.observe(this, Observer { recipeListAdapter.notifyDataSetChanged() })

        return binding.root
    }
}
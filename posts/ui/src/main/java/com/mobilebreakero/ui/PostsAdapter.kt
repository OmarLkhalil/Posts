package com.mobilebreakero.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mobilebreakero.domain.model.PostsResponseItem
import com.mobilebreakero.ui.databinding.PostItemBinding

class PostsAdapter(private val context: Context): ListAdapter<PostsResponseItem, PostsAdapter.ViewHolder>(CategoryDiffCallback()) {

    private lateinit var navController: NavController

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = getItem(position)
        holder.itemBinding.titleTxv.text = post.title
        holder.itemBinding.descTxv.text  = post.body

        holder.itemView.setOnClickListener {
            initPostNav(it, post)
        }
    }

    private fun initPostNav(view: View, post: PostsResponseItem) {
        navController = Navigation.findNavController(view)
//        val action = PostDirections.actionMainToCateDetails(category,null)
//        navController.navigate(action)
    }

    class ViewHolder(val itemBinding: PostItemBinding) : RecyclerView.ViewHolder(itemBinding.root)

    class CategoryDiffCallback : DiffUtil.ItemCallback<PostsResponseItem>() {
        override fun areItemsTheSame(
            oldItem: PostsResponseItem,
            newItem: PostsResponseItem
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: PostsResponseItem,
            newItem: PostsResponseItem
        ): Boolean {
            return oldItem == newItem
        }
    }
}
package com.mobilebreakero.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.mobilebreakero.domain.utils.ResponseState
import com.mobilebreakero.ui.databinding.HomeFragmentBinding
import com.mobilebreakero.ui.viewmodel.PostsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var binding: HomeFragmentBinding
    private val viewModel by activityViewModels<PostsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HomeFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val coroutineScope = CoroutineScope(Dispatchers.IO)
        val adapter = PostsAdapter(requireContext())
        coroutineScope.launch {
            val posts = viewModel.getPosts()
            posts.collect {
                when (it) {
                    is ResponseState.Success -> {
                        it.data.forEach { post ->
                            adapter.submitList(listOf(post))
                        }
                    }

                    is ResponseState.Error -> {
                        it.exception
                        Log.d("HomeFragment", "onViewCreated: ${it.exception}")
                    }

                    is ResponseState.Loading -> {
                        Log.d("HomeFragment", "onViewCreated: Loading")
                    }

                    else -> {

                    }
                }
            }
        }

        binding.postsRec.adapter = adapter
    }
}
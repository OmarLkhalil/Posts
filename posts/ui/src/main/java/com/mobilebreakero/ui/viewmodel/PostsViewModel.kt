package com.mobilebreakero.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.mobilebreakero.domain.usecase.GetDetailsUsecase
import com.mobilebreakero.domain.usecase.GetPostsUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class PostsViewModel @Inject constructor(
    private val getPostsUsecase: GetPostsUsecase,
    private val getDetailsUsecase: GetDetailsUsecase
) : ViewModel() {

    suspend fun getDetails(id: Int) = getDetailsUsecase.invoke(id)

    suspend fun getPosts() = getPostsUsecase.invoke()
}
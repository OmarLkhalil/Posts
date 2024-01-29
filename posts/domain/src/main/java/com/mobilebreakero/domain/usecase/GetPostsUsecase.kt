package com.mobilebreakero.domain.usecase

import com.mobilebreakero.domain.repository.GetPostsRepo

class GetPostsUsecase (private val getPostsRepo: GetPostsRepo) {
    suspend operator fun invoke() = getPostsRepo.getPosts()
}
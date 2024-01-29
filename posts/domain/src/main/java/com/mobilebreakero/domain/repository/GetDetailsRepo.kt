package com.mobilebreakero.domain.repository

import com.mobilebreakero.domain.model.PostsResponseItem
import com.mobilebreakero.domain.utils.ResponseState
import kotlinx.coroutines.flow.Flow

interface GetDetailsRepo {
    suspend fun getDetails(id: Int): Flow<ResponseState<PostsResponseItem>>
}
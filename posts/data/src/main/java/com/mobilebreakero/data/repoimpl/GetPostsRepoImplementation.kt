package com.mobilebreakero.data.repoimpl

import com.mobilebreakero.data.remote.PostsApi
import com.mobilebreakero.domain.model.PostsResponseItem
import com.mobilebreakero.domain.repository.GetPostsRepo
import com.mobilebreakero.domain.utils.ResponseState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetPostsRepoImplementation @Inject constructor(
    private val postsApi: PostsApi
) : GetPostsRepo {
    override suspend fun getPosts(): Flow<ResponseState<List<PostsResponseItem>>> {
        return flow {
            emit(ResponseState.Loading)
            try {
                val response = postsApi.getPosts()
                if (response.isSuccessful) {
                    response.body()?.let {
                        emit(ResponseState.Success(it))
                    }
                } else {
                    emit(ResponseState.Error(Exception(response.message())))
                }
            } catch (e: Exception) {
                emit(ResponseState.Error(e))
            }
        }
    }
}
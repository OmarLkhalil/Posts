package com.mobilebreakero.data.repoimpl

import com.mobilebreakero.data.remote.PostsApi
import com.mobilebreakero.domain.model.PostsResponseItem
import com.mobilebreakero.domain.repository.GetDetailsRepo
import com.mobilebreakero.domain.utils.ResponseState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetDetailsRepoImplementation @Inject constructor(
    private val postsApi: PostsApi
) : GetDetailsRepo {

    override suspend fun getDetails(id: Int): Flow<ResponseState<PostsResponseItem>> {
        return flow {
            emit(ResponseState.Loading)
            try {
                val response = postsApi.getDetails(id)
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
        }.flowOn(Dispatchers.IO)
    }
}
package com.mobilebreakero.data.remote

import com.mobilebreakero.domain.model.PostsResponseItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PostsApi {

    @GET("posts")
    suspend fun getPosts(): Response<List<PostsResponseItem>>

    @GET("posts/{id}")
    suspend fun getDetails(@Path("id") id: Int): Response<PostsResponseItem>

}
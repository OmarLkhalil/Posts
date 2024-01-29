package com.mobilebreakero.data.di

import com.mobilebreakero.data.remote.PostsApi
import com.mobilebreakero.data.repoimpl.GetDetailsRepoImplementation
import com.mobilebreakero.data.repoimpl.GetPostsRepoImplementation
import com.mobilebreakero.domain.repository.GetDetailsRepo
import com.mobilebreakero.domain.repository.GetPostsRepo
import com.mobilebreakero.domain.usecase.GetDetailsUsecase
import com.mobilebreakero.domain.usecase.GetPostsUsecase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Provides
    @Singleton
    fun provideGetPostsRepo(api: PostsApi): GetPostsRepo {
        return GetPostsRepoImplementation(api)
    }

    @Provides
    @Singleton
    fun provideGetDetailsRepo(api: PostsApi): GetDetailsRepo {
        return GetDetailsRepoImplementation(api)
    }

    @Provides
    @Singleton
    fun provideGetPostsUseCase(repo: GetPostsRepo): GetPostsUsecase {
        return GetPostsUsecase(repo)
    }

    @Provides
    @Singleton
    fun provideGetDetailsUseCase(repo: GetDetailsRepo): GetDetailsUsecase {
        return GetDetailsUsecase(repo)
    }
}
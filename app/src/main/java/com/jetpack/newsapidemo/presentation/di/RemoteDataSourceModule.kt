package com.jetpack.newsapidemo.presentation.di

import com.jetpack.newsapidemo.data.api.INewsAPIService
import com.jetpack.newsapidemo.data.repository.dataSource.INewsRemoteDataSource
import com.jetpack.newsapidemo.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataSourceModule {
    @Singleton
    @Provides
    fun providerNewsRemoteDataSource(newsAPIService: INewsAPIService) : INewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsAPIService)
    }
}
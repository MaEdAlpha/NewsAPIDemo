package com.jetpack.newsapidemo.presentation.di

import com.jetpack.newsapidemo.data.repository.NewsRepositoryImpl
import com.jetpack.newsapidemo.data.repository.dataSource.INewsRemoteDataSource
import com.jetpack.newsapidemo.data.repository.dataSource.NewsLocalDataSource
import com.jetpack.newsapidemo.domain.repository.INewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: INewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ):INewsRepository{
        return NewsRepositoryImpl(
            newsRemoteDataSource,
            newsLocalDataSource
        )
    }
}
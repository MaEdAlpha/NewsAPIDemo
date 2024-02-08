package com.jetpack.newsapidemo.presentation.di

import com.jetpack.newsapidemo.domain.repository.INewsRepository
import com.jetpack.newsapidemo.domain.usecase.GetNewsHeadlinesUseCase
import com.jetpack.newsapidemo.domain.usecase.GetSearchedNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Singleton
    @Provides
    fun provideNewsHeadLinesUseCase(
        newsRepository: INewsRepository
    ) : GetNewsHeadlinesUseCase{
        //construct and return dependency
        return GetNewsHeadlinesUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun provideGetSearchedNewsUseCase(
        newsRepository: INewsRepository
    ) : GetSearchedNewsUseCase{
        //construct and return dependency
        return GetSearchedNewsUseCase(newsRepository)
    }
}
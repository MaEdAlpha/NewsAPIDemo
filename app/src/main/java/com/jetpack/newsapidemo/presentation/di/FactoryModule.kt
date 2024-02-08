package com.jetpack.newsapidemo.presentation.di

import android.app.Application
import com.jetpack.newsapidemo.domain.usecase.GetNewsHeadlinesUseCase
import com.jetpack.newsapidemo.domain.usecase.GetSearchedNewsUseCase
import com.jetpack.newsapidemo.domain.usecase.SaveNewsUseCase
import com.jetpack.newsapidemo.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase,
         saveNewsUseCase: SaveNewsUseCase
    ) : NewsViewModelFactory{
        return NewsViewModelFactory(
            application,
            getNewsHeadlinesUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase
        )
    }
}
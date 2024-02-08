package com.jetpack.newsapidemo.presentation.di

import com.jetpack.newsapidemo.data.db.dao.ArticleDAO
import com.jetpack.newsapidemo.data.repository.dataSource.NewsLocalDataSource
import com.jetpack.newsapidemo.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO): NewsLocalDataSource{
        return NewsLocalDataSourceImpl(articleDAO)
    }
}
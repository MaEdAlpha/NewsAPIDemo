package com.jetpack.newsapidemo.presentation.di

import android.app.Application
import androidx.room.Room
import com.jetpack.newsapidemo.data.db.ArticleDatabase
import com.jetpack.newsapidemo.data.db.dao.ArticleDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {
    @Singleton
    @Provides
    fun providerNewsDataBase(app: Application): ArticleDatabase{
        return Room.databaseBuilder(app, ArticleDatabase::class.java, "news_db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideNewsDao(articleDatabase: ArticleDatabase) : ArticleDAO {
        return articleDatabase.getArticleDAO()
    }


}
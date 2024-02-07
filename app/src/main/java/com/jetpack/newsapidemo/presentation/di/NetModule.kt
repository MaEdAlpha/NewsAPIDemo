package com.jetpack.newsapidemo.presentation.di

import com.jetpack.newsapidemo.BuildConfig
import com.jetpack.newsapidemo.data.api.INewsAPIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetModule {
        @Singleton
        @Provides
       fun provideRetrofit(): Retrofit {
           return Retrofit.Builder()
               .addConverterFactory(GsonConverterFactory.create())
               .baseUrl(BuildConfig.URL)
               .build()
       }


        @Singleton
        @Provides
        fun provideNewsAPIService(retrofit: Retrofit): INewsAPIService{
            return retrofit.create(INewsAPIService::class.java)
        }

}


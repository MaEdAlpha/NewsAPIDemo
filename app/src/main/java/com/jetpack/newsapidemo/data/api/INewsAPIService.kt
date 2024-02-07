package com.jetpack.newsapidemo.data.api

import com.jetpack.newsapidemo.data.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import com.jetpack.newsapidemo.BuildConfig
interface INewsAPIService {

    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") //based off api documentation
        country: String,
        @Query("page")
        page: Int,
        @Query("apiKey")
        apiKey: String = BuildConfig.API_KEY,
    ): Response<APIResponse>
}
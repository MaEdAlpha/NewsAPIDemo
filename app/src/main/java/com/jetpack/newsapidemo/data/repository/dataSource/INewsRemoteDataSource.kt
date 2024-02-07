package com.jetpack.newsapidemo.data.repository.dataSource

import com.jetpack.newsapidemo.data.APIResponse
import retrofit2.Response

interface INewsRemoteDataSource {
    suspend fun getTopHeadlines(): Response<APIResponse>
}
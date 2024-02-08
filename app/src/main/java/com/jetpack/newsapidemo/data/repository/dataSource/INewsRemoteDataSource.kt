package com.jetpack.newsapidemo.data.repository.dataSource

import com.jetpack.newsapidemo.data.APIResponse
import retrofit2.Response

interface INewsRemoteDataSource {
    suspend fun getTopHeadlines(country: String, page: Int): Response<APIResponse>
    suspend fun getSearchedNews(country: String, searchQuery: String, page: Int): Response<APIResponse>
}
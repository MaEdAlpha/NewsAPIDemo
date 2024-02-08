package com.jetpack.newsapidemo.data.repository.dataSourceImpl

import com.jetpack.newsapidemo.data.APIResponse
import com.jetpack.newsapidemo.data.api.INewsAPIService
import com.jetpack.newsapidemo.data.repository.dataSource.INewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: INewsAPIService,
) : INewsRemoteDataSource {
    override suspend fun getTopHeadlines(
        country: String,
        page: Int
    ): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }

    override suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Response<APIResponse> {
        return newsAPIService.getSearchedTopHeadlines(country, searchQuery, page)
    }
}
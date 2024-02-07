package com.jetpack.newsapidemo.data.repository.dataSourceImpl

import com.jetpack.newsapidemo.data.APIResponse
import com.jetpack.newsapidemo.data.api.INewsAPIService
import com.jetpack.newsapidemo.data.repository.dataSource.INewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: INewsAPIService,
    private val country: String,
    private val page: Int,
) : INewsRemoteDataSource {
    override suspend fun getTopHeadliners(): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country, page)
    }
}
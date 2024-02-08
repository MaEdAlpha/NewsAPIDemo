package com.jetpack.newsapidemo.domain.usecase

import com.jetpack.newsapidemo.data.APIResponse
import com.jetpack.newsapidemo.data.util.Resource
import com.jetpack.newsapidemo.domain.repository.INewsRepository

class GetSearchedNewsUseCase(private val newsRepository: INewsRepository) {
    suspend fun execute(country: String, searchQuery: String, page: Int) : Resource<APIResponse> {
        return newsRepository.getSearchedNews(country, searchQuery, page)
    }
}
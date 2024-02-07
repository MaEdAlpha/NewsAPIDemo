package com.jetpack.newsapidemo.domain.usecase

import com.jetpack.newsapidemo.data.APIResponse
import com.jetpack.newsapidemo.data.util.Resource
import com.jetpack.newsapidemo.domain.repository.INewsRepository

class GetSearchedNewsUseCase(private val newsRepository: INewsRepository) {
    suspend fun execute(searchQuery: String) : Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}
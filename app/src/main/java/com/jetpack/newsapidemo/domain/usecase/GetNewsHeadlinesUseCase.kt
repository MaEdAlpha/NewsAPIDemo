package com.jetpack.newsapidemo.domain.usecase

import com.jetpack.newsapidemo.data.APIResponse
import com.jetpack.newsapidemo.data.util.Resource
import com.jetpack.newsapidemo.domain.repository.INewsRepository

//UseCase acts as a buffer between your Data and Presentation. Here we setup UseCases to interact with an interface
class GetNewsHeadlinesUseCase(private val newsRepository: INewsRepository) {
    suspend fun execute(country: String, page: Int) : Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country, page)
    }
}
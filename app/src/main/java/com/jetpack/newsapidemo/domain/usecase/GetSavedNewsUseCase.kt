package com.jetpack.newsapidemo.domain.usecase

import com.jetpack.newsapidemo.data.Article
import com.jetpack.newsapidemo.domain.repository.INewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: INewsRepository) {

    fun execute() : Flow<List<Article>>{
        return  newsRepository.getSavedNews()
    }
}
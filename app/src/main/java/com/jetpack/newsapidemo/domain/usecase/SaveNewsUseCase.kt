package com.jetpack.newsapidemo.domain.usecase


import com.jetpack.newsapidemo.data.Article
import com.jetpack.newsapidemo.domain.repository.INewsRepository

class SaveNewsUseCase(private val newsRepository: INewsRepository) {
    suspend fun execute(article: Article) {
        return newsRepository.saveNews(article)
    }
}
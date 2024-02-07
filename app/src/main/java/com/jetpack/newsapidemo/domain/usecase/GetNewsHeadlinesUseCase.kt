package com.jetpack.newsapidemo.domain.usecase

import com.jetpack.newsapidemo.domain.repository.INewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: INewsRepository) {
}
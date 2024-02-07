package com.jetpack.newsapidemo.domain.usecase

import com.jetpack.newsapidemo.domain.repository.INewsRepository

class GetSavedNewsUseCase(private val newsRepository: INewsRepository) {
}
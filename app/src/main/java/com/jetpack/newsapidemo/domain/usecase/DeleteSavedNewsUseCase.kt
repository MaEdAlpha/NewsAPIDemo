package com.jetpack.newsapidemo.domain.usecase

import com.jetpack.newsapidemo.domain.repository.INewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: INewsRepository) {
}
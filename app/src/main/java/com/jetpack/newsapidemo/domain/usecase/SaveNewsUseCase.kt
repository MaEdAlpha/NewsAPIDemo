package com.jetpack.newsapidemo.domain.usecase

import com.jetpack.newsapidemo.domain.repository.INewsRepository

class SaveNewsUseCase(private val newsRepository: INewsRepository) {
}
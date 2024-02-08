package com.jetpack.newsapidemo.data.repository.dataSource

import com.jetpack.newsapidemo.data.Article

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)
}
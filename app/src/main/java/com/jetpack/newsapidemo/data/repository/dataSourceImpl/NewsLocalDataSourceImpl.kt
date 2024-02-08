package com.jetpack.newsapidemo.data.repository.dataSourceImpl

import com.jetpack.newsapidemo.data.Article
import com.jetpack.newsapidemo.data.db.dao.ArticleDAO
import com.jetpack.newsapidemo.data.repository.dataSource.NewsLocalDataSource

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
) : NewsLocalDataSource{
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }
}
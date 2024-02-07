package com.jetpack.newsapidemo.data.repository

import com.jetpack.newsapidemo.data.APIResponse
import com.jetpack.newsapidemo.data.Article
import com.jetpack.newsapidemo.data.util.Resource
import com.jetpack.newsapidemo.domain.repository.INewsRepository
import kotlinx.coroutines.flow.Flow

class NewsRepositoryImpl: INewsRepository {
    override suspend fun getNewsHeadlines(): Resource<APIResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }
}
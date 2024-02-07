package com.jetpack.newsapidemo.data.repository

import com.jetpack.newsapidemo.data.APIResponse
import com.jetpack.newsapidemo.data.Article
import com.jetpack.newsapidemo.data.repository.dataSource.INewsRemoteDataSource
import com.jetpack.newsapidemo.data.util.Resource
import com.jetpack.newsapidemo.domain.repository.INewsRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class NewsRepositoryImpl(
    private val newsRemoteDataSource: INewsRemoteDataSource,

): INewsRepository {
    override suspend fun getNewsHeadlines(): Resource<APIResponse> {
        TODO("Not yet implemented")
    }

    private fun responseToResource(response: Response<APIResponse>):Resource<APIResponse> {
        if(response.isSuccessful){
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }

        return Resource.Error(response.message())
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
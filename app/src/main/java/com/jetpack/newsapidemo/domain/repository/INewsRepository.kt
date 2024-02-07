package com.jetpack.newsapidemo.domain.repository

import androidx.lifecycle.LiveData //Never want Android packages in Domain layer
import com.jetpack.newsapidemo.data.APIResponse
import com.jetpack.newsapidemo.data.Article
import com.jetpack.newsapidemo.data.util.Resource
import kotlinx.coroutines.flow.Flow


interface INewsRepository {

    suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery: String) : Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)

    // WRONG WAY This is bad practice (liveData<List<Article>>)
    //fun getSavedNewsWRONG():LiveData<List<Article>>
    // liveData is a lifecycle aware observable data holder class.
    // should always try to use liveData in view models and observe them from activities and fragments
    // using LiveData in a repository will cause unexpected threading issues.


    //RIGHT WAY
    fun getSavedNews(): Flow<List<Article>> // no need to suspend because flow adds a data stream
    // In Clean Architecture, you udo now use android framework related libraries in the domain layer
    // That means in repository interface and in use case classes we can only import kotlin language and our own classes.

}
package com.jetpack.newsapidemo.domain.repository

import androidx.lifecycle.LiveData
import com.jetpack.newsapidemo.data.APIResponse
import com.jetpack.newsapidemo.data.Article
import com.jetpack.newsapidemo.data.util.Resource
import java.util.concurrent.Flow

interface INewsRepository {

    suspend fun getNewsHeadlines(): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery: String) : Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)

    // WRONG WAY This is bad practice (liveData<List<Article>>)
    fun getSavedNewsWRONG():LiveData<List<Article>>
    // liveData is a lifecycle aware observable data holder class.
    // should always try to use liveData in view models and observe them from activities and fragments
    // using LiveData in a repository will cause unexpected threading issues.


    //RIGHT WAY
    fun getSavedNews():Flow<List<Article>>

}
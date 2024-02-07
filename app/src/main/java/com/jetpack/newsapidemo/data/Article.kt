package com.jetpack.newsapidemo.data

import com.google.gson.annotations.SerializedName
import java.util.Objects

data class NewsSource(
    val id: String,
    val name: String
)
data class Article (
    @SerializedName("source")
    val source: NewsSource,

    @SerializedName("author")
    val author: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("url")
    val url: String,

    @SerializedName("urlToImage")
    val urlToImage: String,

    @SerializedName("publishedAt")
    val publishedAt: String,

    @SerializedName("content")
    val content: String,
)

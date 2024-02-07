package com.jetpack.newsapidemo.api

import com.jetpack.newsapidemo.data.api.INewsAPIService
import okhttp3.mockwebserver.MockWebServer

class NewsAPIServiceTest {
    private lateinit var service: INewsAPIService
    private lateinit var server: MockWebServer
}
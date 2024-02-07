package com.jetpack.newsapidemo.api

import com.jetpack.newsapidemo.data.api.INewsAPIService
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsAPIServiceTest {
    private lateinit var service: INewsAPIService
    private lateinit var server: MockWebServer

    //Alt + Insert hotkey to generate -> setupFunction -> JUnit4
    @Before //runs before @Test
    fun setUp() {
        server - MockWebServer()
        service = Retrofit.Builder()
            .baseUrl(server.url(""))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(INewsAPIService::class.java)
    }

    @After //runs after @Test
    fun tearDown() {
        //Shutdown mock server
        server.shutdown()
    }
}
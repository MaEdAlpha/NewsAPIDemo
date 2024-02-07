package com.jetpack.newsapidemo.api

import com.jetpack.newsapidemo.data.api.INewsAPIService
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okio.buffer
import okio.source
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

    private fun enqueueMockResponse(fileName: String){
        val inputStream = javaClass.classLoader!!.getResourceAsStream(fileName)
        val source = inputStream.source().buffer()
        val mockResponse = MockResponse()
        mockResponse.setBody(source.readString(Charsets.UTF_8))
        server.enqueue(mockResponse)

    }

    @After //runs after @Test
    fun tearDown() {
        //Shutdown mock server
        server.shutdown()
    }
}
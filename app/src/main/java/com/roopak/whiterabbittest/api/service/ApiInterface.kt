package com.roopak.whiterabbittest.api.service

import com.roopak.whiterabbittest.models.ApiResponse
import com.roopak.whiterabbittest.models.Profiles
import retrofit2.Response
import retrofit2.http.GET


interface ApiInterface {
    @GET("5d565297300000680030a986")
    suspend fun hitCountCheck() : Response<List<Profiles>>
}
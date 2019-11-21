package com.unittestapp

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface UnitTestApi {

    @GET("users/{name}")
    fun getUser(
        @Path("name") name: String
    ): Single<User>

}

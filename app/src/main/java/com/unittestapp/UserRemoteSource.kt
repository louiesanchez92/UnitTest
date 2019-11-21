package com.unittestapp

import io.reactivex.Single

interface UserRemoteSource {

    fun getUser(user: String): Single<User>

}
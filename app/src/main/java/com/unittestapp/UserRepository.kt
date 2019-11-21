package com.unittestapp

import io.reactivex.Single

interface UserRepository {

    fun getUser(user: String): Single<User>

}
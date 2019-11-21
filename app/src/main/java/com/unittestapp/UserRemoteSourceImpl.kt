package com.unittestapp

import io.reactivex.Single

class UserRemoteSourceImpl(
    private val api: UnitTestApi
) : UserRemoteSource {

    override fun getUser(user: String): Single<User> {
        return api
            .getUser(user)
    }

}
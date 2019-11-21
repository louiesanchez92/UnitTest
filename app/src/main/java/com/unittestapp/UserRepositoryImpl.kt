package com.unittestapp

import io.reactivex.Single

class UserRepositoryImpl(
    private val userRemoteSource: UserRemoteSource
) : UserRepository {

    override fun getUser(user: String): Single<User> {
        return userRemoteSource
            .getUser(user)
    }

}
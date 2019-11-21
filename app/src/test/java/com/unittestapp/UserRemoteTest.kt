package com.unittestapp

import io.reactivex.Single
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`

class UserRemoteTest {

//    private lateinit var userRemoteSource: UserRemoteSource
//    private val mockApi = Mockito.mock(UnitTestApi::class.java)
//
//    @Before
//    fun setUp() {
//        userRemoteSource = UserRemoteSourceImpl(mockApi)
//    }
//
//    @Test
//    fun getUser_UserFetched_ShouldReturnUser() {
//
//        val response = User("lsanchez2", 123123)
//        val userName = "lsanchez2"
//        val expectedUser = User("lsanchez2", 123123)
//
//        `when`(mockApi.getUser(userName)).thenReturn(Single.just(response))
//
//        userRemoteSource
//            .getUser(userName)
//            .test()
//            .assertComplete()
//            .assertValue { user -> user == expectedUser }
//
//    }

}
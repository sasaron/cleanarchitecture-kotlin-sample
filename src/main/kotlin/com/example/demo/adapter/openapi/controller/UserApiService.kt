package com.example.demo.adapter.openapi.controller

import com.example.demo.adapter.model.User

interface UserApiService {

    fun createUser(body: User): Unit

    fun deleteUser(username: kotlin.String): Unit

    fun getUserByName(username: kotlin.String): User

    fun getUserList(): User

    fun updateUser(username: kotlin.String, body: User): Unit
}

package com.example.demo.adapter.openapi.controller

import com.example.demo.adapter.model.User
import org.springframework.stereotype.Service
@Service
class UserApiServiceImpl : UserApiService {

    override fun createUser(body: User): Unit {
        TODO("Implement me")
    }

    override fun deleteUser(username: kotlin.String): Unit {
        TODO("Implement me")
    }

    override fun getUserByName(username: kotlin.String): User {
        TODO("Implement me")
    }

    override fun getUserList(): User {
        TODO("Implement me")
    }

    override fun updateUser(username: kotlin.String, body: User): Unit {
        TODO("Implement me")
    }
}

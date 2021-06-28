package com.example.demo.adapter.openapi.controller

import com.example.demo.adapter.model.User
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class UserApiTest {

    private val service: UserApiService = UserApiServiceImpl()
    private val api: UserApiController = UserApiController(service)

    
    /**
    * Create user
    *
    * This can only be done by the logged in user.
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun createUserTest() {
        val body:User? = null
        val response: ResponseEntity<Unit> = api.createUser(body!!)

        // TODO: test validations
    }
    
    /**
    * Delete user
    *
    * This can only be done by the logged in user.
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun deleteUserTest() {
        val username:kotlin.String? = null
        val response: ResponseEntity<Unit> = api.deleteUser(username!!)

        // TODO: test validations
    }
    
    /**
    * Get user by user name
    *
    * 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getUserByNameTest() {
        val username:kotlin.String? = null
        val response: ResponseEntity<User> = api.getUserByName(username!!)

        // TODO: test validations
    }
    
    /**
    * Get user list
    *
    * 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getUserListTest() {
        val response: ResponseEntity<User> = api.getUserList()

        // TODO: test validations
    }
    
    /**
    * Updated user
    *
    * This can only be done by the logged in user.
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateUserTest() {
        val username:kotlin.String? = null
        val body:User? = null
        val response: ResponseEntity<Unit> = api.updateUser(username!!, body!!)

        // TODO: test validations
    }
    
}

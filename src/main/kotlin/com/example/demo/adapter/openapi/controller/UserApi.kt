package com.example.demo.adapter.openapi.controller

import com.example.demo.adapter.model.User
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v1}")
class UserApiController(@Autowired(required = true) val service: UserApiService) {


    @PostMapping(
        value = ["/user"]
    )
    fun createUser( @Valid @RequestBody body: User
): ResponseEntity<Unit> {
        return ResponseEntity(service.createUser(body), HttpStatus.valueOf(200))
    }


    @DeleteMapping(
        value = ["/user/{username}"]
    )
    fun deleteUser( @PathVariable("username") username: kotlin.String
): ResponseEntity<Unit> {
        return ResponseEntity(service.deleteUser(username), HttpStatus.valueOf(400))
    }


    @GetMapping(
        value = ["/user/{username}"],
        produces = ["application/json"]
    )
    fun getUserByName( @PathVariable("username") username: kotlin.String
): ResponseEntity<User> {
        return ResponseEntity(service.getUserByName(username), HttpStatus.valueOf(200))
    }


    @GetMapping(
        value = ["/user/list"],
        produces = ["application/json"]
    )
    fun getUserList(): ResponseEntity<User> {
        return ResponseEntity(service.getUserList(), HttpStatus.valueOf(200))
    }


    @PutMapping(
        value = ["/user/{username}"]
    )
    fun updateUser( @PathVariable("username") username: kotlin.String
, @Valid @RequestBody body: User
): ResponseEntity<Unit> {
        return ResponseEntity(service.updateUser(username, body), HttpStatus.valueOf(400))
    }
}

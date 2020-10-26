package com.rafaelbaetapena.course.resources

import com.rafaelbaetapena.course.entities.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/users"])
class UserResource() {

    @GetMapping
    fun findAll(): ResponseEntity<User>{
        val user: User = User(1L, "Maria", "maria@gmail.com", "999999999", "1234")
        return ResponseEntity.ok().body(user)
    }
}
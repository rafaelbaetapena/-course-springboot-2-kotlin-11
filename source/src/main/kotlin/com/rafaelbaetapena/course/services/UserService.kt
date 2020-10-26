package com.rafaelbaetapena.course.services

import com.rafaelbaetapena.course.entities.User
import com.rafaelbaetapena.course.repositories.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(private val userRepository: UserRepository) {

    fun findAll(): List<User> {
        return userRepository.findAll();
    }

    fun findBId(id: Long): User {
        val optionalUser: Optional<User> = userRepository.findById(id);
        return optionalUser.get();
    }
}
package com.rafaelbaetapena.course.config

import com.rafaelbaetapena.course.entities.User
import com.rafaelbaetapena.course.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import java.util.*

@Configuration
@Profile("test")
class TestConfig(private val userRepository: UserRepository) : CommandLineRunner  {

    override fun run(vararg args: String?) {

        val u1: User = User(null, "Maria Brown", "maria@gmail.com", "988888888", "1234")
        val u2: User = User(null, "Alex Green", "alex@gmail.com", "977777777", "1234")

        userRepository.saveAll(listOf(u1, u2))
    }
}
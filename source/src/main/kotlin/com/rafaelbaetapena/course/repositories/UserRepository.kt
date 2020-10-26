package com.rafaelbaetapena.course.repositories

import com.rafaelbaetapena.course.entities.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>
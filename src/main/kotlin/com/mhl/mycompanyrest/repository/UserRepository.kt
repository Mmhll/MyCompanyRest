package com.mhl.mycompanyrest.repository

import com.mhl.mycompanyrest.model.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<Users, Int> {
}
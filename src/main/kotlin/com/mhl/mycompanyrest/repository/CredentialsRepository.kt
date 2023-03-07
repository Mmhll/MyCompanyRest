package com.mhl.mycompanyrest.repository

import com.mhl.mycompanyrest.model.Credentials
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface CredentialsRepository: JpaRepository<Credentials, Int> {
}
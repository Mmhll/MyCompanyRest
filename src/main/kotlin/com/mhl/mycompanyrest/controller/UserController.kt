package com.mhl.mycompanyrest.controller

import com.mhl.mycompanyrest.model.Credentials
import com.mhl.mycompanyrest.model.UserFull
import com.mhl.mycompanyrest.model.Users
import com.mhl.mycompanyrest.repository.CredentialsRepository
import com.mhl.mycompanyrest.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Sort
import org.springframework.data.querydsl.QSort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1")
class UserController {
    @Autowired
    private lateinit var credentialsRepository: CredentialsRepository
    @Autowired
    private lateinit var userRepository: UserRepository

    @GetMapping("/users")
    fun getUsers(): List<Users> {
        return userRepository.findAll()
    }

    @GetMapping("/users_with_credentials")
    fun getUsersWithCredentials(): List<Credentials>{
        return credentialsRepository.findAll()
    }



    @PostMapping("/create_user")
    fun createUser(@RequestBody credentials: Credentials): Credentials{

        userRepository.save(Users(
            name = credentials.user.name,
            surname = credentials.user.surname,
            patronymic = credentials.user.patronymic,
            phone_number = credentials.user.phone_number,
            sex = credentials.user.sex
            ))


        val currentUser = userRepository.findAll(Sort.by("id").descending())[0]


        credentialsRepository.save(
            Credentials(
                email = credentials.email,
                password = credentials.password,
                user = currentUser
            )
        )
        return credentialsRepository.findAll(Sort.by("id").descending())[0]
    }
}
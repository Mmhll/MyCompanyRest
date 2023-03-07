package com.mhl.mycompanyrest.model

import org.springframework.context.annotation.Primary
import javax.persistence.*

@Entity
@Table(name = "users")
data class Users(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    @Column(name = "name", nullable = false)
    val name: String,
    @Column(name = "surname", nullable = false)
    val surname: String,
    @Column(name = "patronymic", nullable = false)
    val patronymic: String,
    @Column(name = "phone_number", nullable = false)
    val phone_number: String,
    @Column(name = "sex", nullable = false)
    val sex: String,
)

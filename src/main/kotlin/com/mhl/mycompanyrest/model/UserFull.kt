package com.mhl.mycompanyrest.model

import javax.persistence.Column

data class UserFull(
    val name: String,
    val surname: String,
    val patronymic: String,
    val phone_number: String,
    val sex: String,
    val email: String,
    val password: String
)

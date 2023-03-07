package com.mhl.mycompanyrest.model

import javax.persistence.*

@Entity
@Table(name = "credentials")
data class Credentials(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(name = "email")
    val email: String,

    @Column(name = "password")
    val password: String,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "user_id")
    val user: Users
)

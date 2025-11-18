package com.example.parcialtp3_2.infraestructure

data class CreateUserRequest(
    val id: Int,
    val username: String,
    val email: String,
    val password: String
)
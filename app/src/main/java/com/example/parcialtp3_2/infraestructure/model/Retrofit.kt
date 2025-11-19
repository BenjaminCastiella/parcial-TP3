package com.example.parcialtp3_2.infraestructure.model

import com.example.parcialtp3_2.infraestructure.LoginResponse
import com.example.parcialtp3_2.infraestructure.Transaction
import com.example.parcialtp3_2.infraestructure.TransactionResponse
import com.example.parcialtp3_2.infraestructure.UserResponse

interface Retrofit {

    suspend fun getToken(username:String,password: String): LoginResponse?
    suspend fun getCreate(username: String,email: String,password: String,): UserResponse?

    suspend fun getUser(): UserResponse?
    suspend fun getTransaction(): TransactionResponse?



}
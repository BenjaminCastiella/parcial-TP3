package com.example.parcialtp3_2.infraestructure.model

import com.example.parcialtp3_2.infraestructure.LoginResponse
import com.example.parcialtp3_2.infraestructure.Transaction

interface Retrofit {

    suspend fun getToken(username:String,password: String): LoginResponse?
}
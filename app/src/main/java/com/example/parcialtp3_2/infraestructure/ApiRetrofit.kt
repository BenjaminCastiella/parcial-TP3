package com.example.parcialtp3_2.infraestructure
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST



interface ApiRetrofit {

    @POST("auth/create")
    suspend fun createUser(@Body request: CreateUserRequest): Response<AuthResponse>


    @POST("auth/login")
    suspend fun loginUser(@Body request: LoginRequest): Response<LoginResponse>

}
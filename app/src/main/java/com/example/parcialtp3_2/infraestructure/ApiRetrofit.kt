package com.example.parcialtp3_2.infraestructure
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST


interface ApiRetrofit {
    @POST("auth/login")
    suspend fun loginUser(
        @Body credentials: LoginRequest
    ): retrofit2.Response<LoginResponse>

    @POST("auth/create")
    suspend fun createUser(
        @Body user: CreateUserRequest
    ): retrofit2.Response<UserResponse>



    @GET("users/12345")
    suspend fun getUserProfile(
    ): retrofit2.Response<UserResponse>



    @GET("transactions")
    suspend fun getTransactions(
    ): retrofit2.Response<TransactionResponse>






}
package com.example.parcialtp3_2.infraestructure

import com.google.gson.annotations.SerializedName

data class CreateUserResponse(

    val id: Int,
val email: String,
val username: String
)

data class CreateUserRequest(
    val id: Int,
    val username: String,
    val email: String,
    val password: String
)

data class LoginRequest(
    val username: String,
    val password: String
)

data class LoginResponse(

    val token: String,

)

data class TransactionResponse(
    val user_id :Int,
    val balanced: Double,
    val income : Int,
    val expense : Double,
    val transaction : List<Transaction>
)
data class Transaction(
    val transaction_id: String,
    val date: String,
    val description: String,
    val amount: Double,
    val currency : String,
    val type : String,
    val subtype : String
)


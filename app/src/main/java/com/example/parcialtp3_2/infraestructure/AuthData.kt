package com.example.parcialtp3_2.infraestructure

import com.google.gson.annotations.SerializedName

data class UserResponse(
    val address: Adress,
    val id : Int,
    val email: String,
    val username: String,
    val password: String,
    val name : Name,
    val phone : String,

)

data class Name(
    val firstname: String,
    val lastname: String
)
data class Adress(
   val geoLocation : GeoLocation,
    val city : String,
    val street : String,
    val number : Int,
    val zipcode : String
)
data class GeoLocation(
    val lat: Double,
  val long: Double
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


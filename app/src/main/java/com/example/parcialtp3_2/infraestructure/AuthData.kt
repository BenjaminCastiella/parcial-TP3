package com.example.parcialtp3_2.infraestructure

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("address") val address: Adress,
    @SerializedName("id") val id: Int,
    @SerializedName("email") val email: String,
    @SerializedName("username") val username: String,
    @SerializedName("password") val password: String,
    @SerializedName("name") val name: Name,
    @SerializedName("phone") val phone: String,
)

data class Name(
    @SerializedName("firstname") val firstname: String,
    @SerializedName("lastname") val lastname: String
)

data class Adress(
    @SerializedName("geolocation") val geoLocation: GeoLocation,
    @SerializedName("city") val city: String,
    @SerializedName("street") val street: String,
    @SerializedName("number") val number: Int,
    @SerializedName("zipcode") val zipcode: String
)

data class GeoLocation(
    @SerializedName("lat") val lat: Double,
    @SerializedName("long") val long: Double
)

data class CreateUserRequest(
    @SerializedName("id") val id: Int,
    @SerializedName("username") val username: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String
)

data class LoginRequest(
    @SerializedName("username") val username: String,
    @SerializedName("password") val password: String
)

data class LoginResponse(
    @SerializedName("token") val token: String,
)

data class TransactionResponse(
    @SerializedName("user_id") val user_id: Int,
    @SerializedName("balanced") val balanced: Double,
    @SerializedName("income") val income: Int,
    @SerializedName("expense") val expense: Double,
    @SerializedName("transaction") val transaction: List<Transaction>
)

data class Transaction(
    @SerializedName("transaction_id") val transaction_id: String,
    @SerializedName("date") val date: String,
    @SerializedName("description") val description: String,
    @SerializedName("amount") val amount: Double,
    @SerializedName("currency") val currency: String,
    @SerializedName("type") val type: String,
    @SerializedName("subtype") val subtype: String
)
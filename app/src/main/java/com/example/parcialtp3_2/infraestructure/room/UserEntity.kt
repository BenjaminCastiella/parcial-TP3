package com.example.parcialtp3_2.infraestructure.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val email: String,
    val mobile_number: String,
    val birth_date: String,
    val created_at: String
)
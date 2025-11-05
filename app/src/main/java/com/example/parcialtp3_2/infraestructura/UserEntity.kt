package com.example.parcialtp3_2.infraestructura

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime
import java.util.Date

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val email: String,
    val mobile_number: String,
    val birth_date: String,
    val created_at: String
)
package com.example.parcialtp3_2.infraestructure

data class RegisterUiState(
val isLoading: Boolean = false,
val isSuccess: Boolean = false,
val errorMessage: String? = null,
val token: String? = null // Para almacenar el token si el login es exitoso
)

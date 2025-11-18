package com.example.parcialtp3_2.infraestructure.model
import android.R.attr.id
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.parcialtp3_2.infraestructure.CreateUserRequest
import com.example.parcialtp3_2.infraestructure.RegisterUiState
import com.example.parcialtp3_2.infraestructure.RetrofitClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {
    // 1. Declaración del estado privado y mutable (internamente modificable)
    // CORRECCIÓN 1: Usar RegisterUiState para el StateFlow
    private val _uiState = MutableStateFlow(RegisterUiState())
    // CORRECCIÓN 2: El tipo público debe ser StateFlow<RegisterUiState>
    val uiState: StateFlow<RegisterUiState> = _uiState

    // 3. Función de registro
    fun registerUser(
        // CORRECCIÓN 3: Los parámetros deben coincidir con lo que recibe tu función
        name: String,
        email: String,
        mobileNum: String,
        birth: String,
        psswd: String
    ) {
        // Establecer estado de carga al inicio
        _uiState.value = RegisterUiState(isLoading = true)

        viewModelScope.launch {
            try {
                // CORRECCIÓN 4: Construir CreateUserRequest
                // NOTA: El 'id' se está generando aquí (debe ser un valor válido para tu API)
                val request = CreateUserRequest(
                    id = (0..10000).random(), // ID Temporal, tu backend debería asignarlo
                    username = name, // Usar el nombre como username
                    email = email,
                    password = psswd // Usar psswd como password
                )

                // Llamada a la API (retorna Response<AuthResponse>)
                val response = RetrofitClient.apiService.createUser(request)

                if (response.isSuccessful) {
                    val authData = response.body()
                    if (authData != null) {
                        // Éxito: Usar AuthResponse para actualizar el estado
                        _uiState.value = RegisterUiState(
                            isSuccess = true,
                            token = authData.token, // Guardar el token
                            isLoading = false
                        )
                    } else {
                        _uiState.value = RegisterUiState(errorMessage = "Respuesta vacía.", isLoading = false)
                    }
                } else {
                    val errorBody = response.errorBody()?.string() ?: "Error desconocido"
                    _uiState.value = RegisterUiState(
                        errorMessage = "Error API ${response.code()}: $errorBody",
                        isLoading = false
                    )
                }
            } catch (e: Exception) {
                _uiState.value = RegisterUiState(
                    errorMessage = "Fallo de red: ${e.message}",
                    isLoading = false
                )
            }
        }
    }
}
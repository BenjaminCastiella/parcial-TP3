package com.example.parcialtp3_2.infraestructure.model
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.parcialtp3_2.infraestructure.LoginRequest
import com.example.parcialtp3_2.infraestructure.RegisterUiState
import com.example.parcialtp3_2.infraestructure.RetrofitClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// Estado de la UI para comunicar el resultado del login al Composable


class LoginViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(RegisterUiState())
    val uiState: StateFlow<RegisterUiState> = _uiState

    fun login(email: String, psswd: String) {
        _uiState.value = RegisterUiState(isLoading = true)

        viewModelScope.launch {
            try {
                val request = LoginRequest(email, psswd)
                val response = RetrofitClient.apiService.loginUser(request) // Este error desaparece con la estructura de datos correcta y dependencias


                if (response.isSuccessful) {
                    // **CORRECCIÓN AQUÍ:** Usamos 'let' para garantizar que el 'body' no sea nulo
                    response.body()?.let { body ->
                        // Si el body NO es nulo, podemos acceder a sus propiedades
                        _uiState.value = RegisterUiState(
                            isSuccess = true,
                            token = body.token // **body.token corregido** porque 'body' ya NO es nulo
                        )
                    } ?: run {
                        // Caso: La respuesta es exitosa (código 200), pero el cuerpo es nulo.
                        _uiState.value = RegisterUiState(
                            errorMessage = "Login exitoso pero el servidor no devolvió datos (Token)."
                        )
                    }
                } else {
                    // Manejo del error HTTP
                    val errorBody = response.errorBody()?.string() ?: "Error desconocido"
                    _uiState.value = RegisterUiState(
                        errorMessage = "Error de Login: Código ${response.code()} - $errorBody"
                    )
                }
            } catch (e: Exception) {
                // Manejo de errores de red
                _uiState.value = RegisterUiState(
                    errorMessage = "Fallo de conexión o red: ${e.message}"
                )
            }
        }
    }
}
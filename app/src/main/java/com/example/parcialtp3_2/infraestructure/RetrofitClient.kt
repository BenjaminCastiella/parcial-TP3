package com.example.parcialtp3_2.infraestructure
import com.google.firebase.appdistribution.gradle.ApiService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import okhttp3.logging.HttpLoggingInterceptor

class RetrofitClient : com.example.parcialtp3_2.infraestructure.model.Retrofit {
    private val BASE_URL = "https://d9811bf4-5e67-4a8c-bdcf-603cbbfc0275.mock.pstmn.io/"
    private val API_KEY = "123456789"

    private val apiKeyInterceptor = Interceptor { chain ->
        val originalRequest = chain.request()
        val newRequest = originalRequest.newBuilder()
            .header("x-api-key", API_KEY)
            .build()
        chain.proceed(newRequest)
    }

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(apiKeyInterceptor)
       .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build()


    private val retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: ApiRetrofit = retrofit.create(ApiRetrofit::class.java)



    override suspend fun getToken(username:String,password: String): LoginResponse? {

        val request = LoginRequest (
            username = username,
            password = password
        )

        return try {
            val response = apiService.loginUser(request)

            if (response.isSuccessful) {
                // Devolver el cuerpo si la respuesta es exitosa
                response.body()
            } else {
                // Manejo de error HTTP
                println("Error de Login: Código ${response.code()}")
                null
            }
        } catch (e: Exception) {
            // Manejo de error de conexión/red
            println("Error de Conexión: ${e.message}")
            null
        }
    }

    }


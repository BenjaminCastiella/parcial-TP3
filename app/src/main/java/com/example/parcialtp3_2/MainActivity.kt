package com.example.parcialtp3_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.parcialtp3_2.ui.theme.Parcialtp3_2Theme
import com.example.parcialtp3_2.views.LogIn
import com.example.parcialtp3_2.views.Menu
import com.example.parcialtp3_2.views.SignUp
import com.example.parcialtp3_2.views.Welcome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            Parcialtp3_2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "/"
                    ){
                        composable(route = "/") {
                            Welcome(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "sign") {
                            SignUp(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "log") {
                            LogIn(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "menu") {
                            Menu(navController, modifier = Modifier.padding(innerPadding))
                        }

                    }
                }
            }
        }
    }
}
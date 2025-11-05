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
import com.example.parcialtp3_2.views.CreateAccount
import com.example.parcialtp3_2.views.ForgotPassword
import com.example.parcialtp3_2.views.Home
import com.example.parcialtp3_2.views.LogIn
import com.example.parcialtp3_2.views.NewPassword
import com.example.parcialtp3_2.views.SecurityPinView
import com.example.parcialtp3_2.views.SignUp
import com.example.parcialtp3_2.views.SuccessView
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
                        startDestination = "sign"
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
                        composable(route = "home") {
                            Home(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable("create_account"){
                            CreateAccount(navController,modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "forgot") {
                            ForgotPassword(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "security_pin") {
                            SecurityPinView(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "new_password") {
                            NewPassword(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "exito") {
                            SuccessView(navController, modifier = Modifier.padding(innerPadding))
                        }


                    }
                }
            }
        }
    }
}
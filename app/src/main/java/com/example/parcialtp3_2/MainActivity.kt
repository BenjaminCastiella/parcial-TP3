package com.example.parcialtp3_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import androidx.room.Transaction
import com.example.parcialtp3_2.components.PantallaCarga
import com.example.parcialtp3_2.infraestructura.AppDatabase
import com.example.parcialtp3_2.infraestructura.MIGRATION_1_2
import com.example.parcialtp3_2.ui.theme.Parcialtp3_2Theme
import com.example.parcialtp3_2.views.AddFinger
import com.example.parcialtp3_2.views.ChangePin
import com.example.parcialtp3_2.views.CreateAccount
import com.example.parcialtp3_2.views.EditProfile
import com.example.parcialtp3_2.views.FingerPoint
import com.example.parcialtp3_2.views.ForgotPassword
import com.example.parcialtp3_2.views.Home
import com.example.parcialtp3_2.views.JohnFinger
import com.example.parcialtp3_2.views.LogIn
import com.example.parcialtp3_2.views.NewPassword
import com.example.parcialtp3_2.views.Profile
import com.example.parcialtp3_2.views.Security
import com.example.parcialtp3_2.views.SecurityPinView
import com.example.parcialtp3_2.views.SignUp
import com.example.parcialtp3_2.views.SuccessView
import com.example.parcialtp3_2.views.TermsConditions
import com.example.parcialtp3_2.views.TransactionScreenContent
import com.example.parcialtp3_2.views.Welcome
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val dataBase = Room.databaseBuilder(
            applicationContext,
            klass = AppDatabase::class.java, name = "finance_app_db"
        ).addMigrations(MIGRATION_1_2).build()

        lifecycleScope.launch {
            println(dataBase.userDao().getAll())
        }

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
                        composable(route = "home") {
                            Home(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable("create_account"){
                            CreateAccount(navController, modifier = Modifier.padding(innerPadding), dataBase)
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
                        composable(route = "profile") {
                            Profile(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "trans") {
                            TransactionScreenContent(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "security") {
                            Security(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "changePin") {
                            ChangePin(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "pantallaCargaPin") {
                            PantallaCarga(navController, modifier = Modifier.padding(innerPadding),
                                title = "Pin Has Been\nChanged Successfully", salida = "security",
                                destinationInicial = "changePin"
                            )
                        }
                        composable(route = "pantallDelete") {
                            PantallaCarga(navController, modifier = Modifier.padding(innerPadding),
                                title = "The fingerprint\nHas been Successfully\nDeleted.", salida = "fingerPoint",
                                destinationInicial = "johnFinger")
                        }
                        composable(route = "pantallaAdd") {
                            PantallaCarga(navController, modifier = Modifier.padding(innerPadding),
                                title = "Fingerprint Has Been\nChanged Successfully", salida = "fingerPoint",
                                destinationInicial = "addFinger")
                        }
                        composable(route = "fingerPoint") {
                            FingerPoint(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "johnFinger") {
                            JohnFinger(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "addFinger") {
                            AddFinger(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "terms") {
                            TermsConditions(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = "editProfile") {
                            EditProfile(navController, modifier = Modifier.padding(innerPadding))
                        }
                    }
                }
            }
        }
    }
}
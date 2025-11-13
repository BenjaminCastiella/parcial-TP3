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
import com.example.parcialtp3_2.code_behind.ViewsRoutes
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
                        startDestination = ViewsRoutes.START.getRoute()
                    ){
                        composable(route = ViewsRoutes.START.getRoute()) {
                            Welcome(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.SIGN_UP.getRoute()) {
                            SignUp(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.HOME.getRoute()) {
                            Home(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(ViewsRoutes.CREATE_ACCOUNT.getRoute()){
                            CreateAccount(navController, modifier = Modifier.padding(innerPadding), dataBase)
                        }
                        composable(route = ViewsRoutes.FORGOT_PSWD.getRoute()) {
                            ForgotPassword(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.SECURITY_PIN.getRoute()) {
                            SecurityPinView(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.NEW_PSWD.getRoute()) {
                            NewPassword(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.SUCCESS.getRoute()) {
                            SuccessView(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.PROFILE.getRoute()) {
                            Profile(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.TRANSACTIONS.getRoute()) {
                            TransactionScreenContent(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = ViewsRoutes.SECURITY.getRoute()) {
                            Security(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.CHANGE_PIN.getRoute()) {
                            ChangePin(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.LOAD.getRoute()) {
                            PantallaCarga(navController, modifier = Modifier.padding(innerPadding),
                                title = "Pin Has Been\nChanged Successfully", salida = "security",
                                destinationInicial = "changePin"
                            )
                        }
                        composable(route = ViewsRoutes.DELETE.getRoute()) {
                            PantallaCarga(navController, modifier = Modifier.padding(innerPadding),
                                title = "The fingerprint\nHas been Successfully\nDeleted.", salida = "fingerPoint",
                                destinationInicial = "johnFinger")
                        }
                        composable(route = ViewsRoutes.ADD.getRoute()) {
                            PantallaCarga(navController, modifier = Modifier.padding(innerPadding),
                                title = "Fingerprint Has Been\nChanged Successfully", salida = "fingerPoint",
                                destinationInicial = "addFinger")
                        }
                        composable(route = ViewsRoutes.FINGER_POINT.getRoute()) {
                            FingerPoint(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.JOHN_FINGER.getRoute()) {
                            JohnFinger(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.ADD_FINGER.getRoute()) {
                            AddFinger(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.TERMS_AND_CONDITIONS.getRoute()) {
                            TermsConditions(navController, modifier = Modifier.padding(innerPadding))
                        }
                        composable(route = ViewsRoutes.EDIT_PROFILE.getRoute()) {
                            EditProfile(navController, modifier = Modifier.padding(innerPadding))
                        }
                    }
                }
            }
        }
    }
}



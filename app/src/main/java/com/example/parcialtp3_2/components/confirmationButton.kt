package com.example.parcialtp3_2.components

import android.R
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.launch


@Composable
fun confirmationButton(
    modifier: Modifier,
    initText: String,
    buttonColor: Color = Color(0xFF00D09E),
    navController: NavController? = null, esCreate:Boolean,
    onClick: suspend () -> Unit
) {
    val scope = rememberCoroutineScope()

    Button(
        shape = RoundedCornerShape(30.dp),
        onClick = {
            scope.launch {
                when(initText){
                    "Log In" -> {
                        // Navega al home
                        navController?.navigate("home")
                    }
                    "Sign Up" -> {
                        // Navega al create account
                        if(esCreate){
                            onClick()
                            println("todo ok!!!!!!!!!!!!!")
                            navController?.navigate("sign")
                        } else {
                            navController?.navigate("create_account")
                        }
                    }
                    "Next Step" -> {
                        // Navega al new password
                        navController?.navigate("security_pin")
                    }
                    "Accept" -> {
                        // Navega al new psswd
                        navController?.navigate("new_password")
                    }
                    "Change Password" -> {
                        // Navega a la ventana de exito
                        navController?.navigate("exito")
                    }
                }
            }
        },
        modifier = modifier.width(195.dp).height(55.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor
        )
    ) {
        Text(
            text = initText,
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = FontFamily(Font(com.example.parcialtp3_2.R.font.poppins_semi_bold))
        )
    }
}

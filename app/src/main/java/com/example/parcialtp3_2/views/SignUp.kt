package com.example.parcial_tp3_gro_8.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import  androidx.compose.ui.Modifier
import com.example.parcial_tp3_gro_8.components.ViewBackground

@Composable
fun SignUp(navController: NavController, modifier: Modifier){
    ViewBackground(
        false,
        0.70f,
        content1 = {
            Text("Hola")
        },
        content2 = {
            Text("Adiós")
        }
    )
}
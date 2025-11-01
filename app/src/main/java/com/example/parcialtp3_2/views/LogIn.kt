package com.example.parcialtp3_2.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import  androidx.compose.ui.Modifier
import com.example.parcialtp3_2.components.ViewBackground

@Composable
fun LogIn(navController: NavController, modifier: Modifier){
    ViewBackground(
        false,
        0.70f,
        null,
        content1 = {
            Text("Hola")
        },
        content2 = {
            Text("Adiós")
        }
    )
}
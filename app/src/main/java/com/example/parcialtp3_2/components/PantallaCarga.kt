package com.example.parcialtp3_2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.ui.theme.poppinsFamily
import data.PantallaDeCarga
import kotlinx.coroutines.delay

@Composable
fun PantallaCarga(
    navController: NavController,
    title: String,                 // Aquí solo cambia el título
    salida: String,                // Pantalla a la que navegar después
    destinationInicial: String,    // Pantalla actual para popUpTo
    modifier: Modifier = Modifier
) {
    // Lanzar la navegación después de 3 segundos
    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate(salida) {
            popUpTo(destinationInicial) { inclusive = true }
        }
    }

    // Pantalla
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF00D09E))
            .systemBarsPadding(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            IconBox(IconBoxes.GREEN_GRANDE, R.drawable.icono_change)

            Spacer(modifier = Modifier.height(25.dp))


            Text(
                text = title,
                color = colorResource(R.color.Light_Green),
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}
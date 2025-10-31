package com.example.parcialtp3_2.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.parcial_tp3_gro_8.components.ViewBackground
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.R

@Composable
fun Welcome(navController: NavController, modifier: Modifier){
    ViewBackground(
        false,
        0.70f,
        content1 = {
            Text(
                "Welcome to Expense Manager",
                textAlign = TextAlign.Center,
                modifier = modifier
                    .padding(top = 30.dp),
                lineHeight = 40.sp,
                color = Color(0xBB031314),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        },
        content2 = {
            Image(
                modifier = modifier
                    .align(alignment = Alignment.Center)
                    .width(250.dp),
                painter = painterResource(id = R.drawable.welcome_img1),
                contentDescription = "Bienvenido"
            )
        }
    )
}
package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.ViewsRoutes
import com.example.parcialtp3_2.ui.theme.poppinsFamily

@Composable
fun BotonAdd(navController: NavController) {
    Button(
        onClick = {
            navController.navigate(ViewsRoutes.ADD.getRoute())
        },
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.Light_Green)),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .height(45.dp)
    ) {
        Text(
            text = "Use Touch Id",
            color = colorResource(R.color.Void),
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp
        )
    }
}
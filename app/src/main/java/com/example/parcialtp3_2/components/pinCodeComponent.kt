package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable

fun pinCodeComponent(pinCode: String = "273916") {
    // Implementación del componente de PIN
    Row (
        modifier = Modifier.width(307.dp).wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        repeat(6){index ->
            val digit = pinCode.getOrElse(index) { ' ' }

            DigitCircle(digit = digit)
        }
    }

}


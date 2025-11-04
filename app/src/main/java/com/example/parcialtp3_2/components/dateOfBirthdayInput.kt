package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable

fun dateOfBirthdayInput(modifier: Modifier, initText: String){

    var dateOfBirth by remember { mutableStateOf("") }

    TextField(
        value = dateOfBirth,
        onValueChange = { nuevoTexto: String ->

            if (nuevoTexto.all { it.isDigit() || it == '/'  }) {

                if (nuevoTexto.length <= 10) {
                    dateOfBirth = nuevoTexto
                }
            }
        },
        singleLine = true,
        placeholder = { Text("DD / MM /YYYY") },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color(0xFFDFF7E2),
            unfocusedContainerColor = Color(0xFFDFF7E2),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
    ),
    shape = RoundedCornerShape(50),
    modifier = Modifier
        .fillMaxWidth()
        .height(56.dp)

    )

}
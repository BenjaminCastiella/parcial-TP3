package com.example.parcialtp3_2.components

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.R

@Composable

fun inputText(modifier: Modifier, initText: String){
    var textState by remember { mutableStateOf("") }

    TextField(
        value = textState,
        onValueChange = { newText: String ->
            textState = newText
        },
        placeholder = {
            Text(
                text = initText,
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                fontFamily = FontFamily(Font(R.font.poppins_medium)),
                color = Color(0xFF031314)
            )
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color(0xFFDFF7E2),
            unfocusedContainerColor = Color(0xFFDFF7E2),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
        ),
        shape = RoundedCornerShape(18.dp),
        modifier = modifier
            .width(356.dp)
            .height(51.dp)


    )

}
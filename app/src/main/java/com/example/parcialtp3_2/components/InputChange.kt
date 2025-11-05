package com.example.parcialtp3_2.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.ui.theme.poppinsFamily
import com.example.parcialtp3_2.R
import androidx.compose.ui.text.TextStyle



@Composable
fun InputChange(
    title: String)
{
    var text by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {

        Text(
            text = title,
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            color = colorResource(R.color.Void)
        )

        Spacer(modifier = Modifier.height(4.dp))

        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = {
                Text(
                    text = "●●●●",
                    color = colorResource(R.color.Cyprus),
                    fontSize = 18.sp
                )
            },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ojo_cerrado),
                    contentDescription = "Eye icon",
                    tint = colorResource(R.color.Cyprus)
                )
            },
            modifier = Modifier
                .fillMaxWidth(0.98f)
                .height(55.dp)
                .clip(RoundedCornerShape(14.dp))
                .background(colorResource(R.color.Light_Green)),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = colorResource(R.color.Light_Green),
                unfocusedContainerColor = colorResource(R.color.Light_Green),
                disabledContainerColor = colorResource(R.color.Light_Green),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color(0xFF00D09E)
            ),
            textStyle = TextStyle(
                fontFamily = poppinsFamily,
                fontSize = 14.sp,
                color = colorResource(R.color.Void)
            )
        )

        Spacer(modifier = Modifier.height(12.dp))



    }}


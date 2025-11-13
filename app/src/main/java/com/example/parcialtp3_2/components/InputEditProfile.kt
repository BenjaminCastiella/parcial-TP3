package com.example.parcialtp3_2.components

import android.R.attr.title
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.ui.theme.poppinsFamily


@Composable
fun InputEditProfile(
    title: String,
    placeholder: String
) {
    var text by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)) {
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
                    text = placeholder,
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(R.color.Void),
                    fontSize =10.sp
                )
            },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = colorResource(R.color.Light_Green),
                unfocusedContainerColor = colorResource(R.color.Light_Green),
                disabledContainerColor = colorResource(R.color.Light_Green),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color(0xFF00D09E),
                unfocusedPlaceholderColor = colorResource(R.color.Void),
                focusedPlaceholderColor = colorResource(R.color.Void),
            ),
            textStyle = TextStyle(
                fontFamily = poppinsFamily,
                fontSize = 10.sp,
                color = colorResource(R.color.Void)
            )
        )
    }

    Spacer(modifier = Modifier.height(3.dp))
}

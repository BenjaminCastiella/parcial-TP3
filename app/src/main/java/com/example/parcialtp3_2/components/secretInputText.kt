
package com.example.parcialtp3_2.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.R

@Composable
fun secretInputText(modifier: Modifier, initText: String) {
    var textState by remember { mutableStateOf(initText) }

    val fieldTextStyle = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.W400,
        fontFamily = FontFamily(Font(R.font.poppins_regular)),
        letterSpacing = 0.7.em
    )

    TextField(
        value = textState,
        onValueChange = { newText -> textState = newText },
        textStyle = fieldTextStyle,
        placeholder = {
            Text(
                text = initText,
                style = fieldTextStyle.copy(color = Color(0xFF031314))
            )
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color(0xFFDFF7E2),
            unfocusedContainerColor = Color(0xFFDFF7E2),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        trailingIcon = {
            Image(
                painter = painterResource(id = R.drawable.eye_pass),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        },
        shape = RoundedCornerShape(18.dp),
        modifier = modifier
            .width(356.dp)
            .height(51.dp)
    )
}

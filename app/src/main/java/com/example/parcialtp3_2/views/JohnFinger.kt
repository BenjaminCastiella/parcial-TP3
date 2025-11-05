package com.example.parcialtp3_2.views

import android.R.attr.text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.components.BotonDelete
import com.example.parcialtp3_2.components.IconBox
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.ui.theme.poppinsFamily

@Composable
fun JohnFinger(navController: NavController, modifier: Modifier){
    ViewBackground(
        true,
        0.85f,
        navController,
        content1 = {Box(
            modifier = Modifier
                .absoluteOffset(x = 325.dp, y = 61.dp)
                .clip(RoundedCornerShape(25.71.dp))
                .width(30.dp)
                .height(30.dp)


        ) {
            IconBox(iconBox = IconBoxes.LIGHT_GREEN, icon = R.drawable.vector)
        }
            Box(
                modifier = Modifier
                    .absoluteOffset(x = 25.dp, y = 61.dp)
                    .clip(RoundedCornerShape(25.71.dp))
                    .width(30.dp)
                    .height(30.dp)
            ) {
                IconBox(iconBox = IconBoxes.GREEN, icon = R.drawable.flecha_back)
            }

            Text(
                text = "Jhon FingerPrint",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                color = colorResource(R.color.Void),
                modifier = Modifier.absoluteOffset(x = 105.dp, y = 61.dp)


            )


        },
        content2 = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                .systemBarsPadding(),
                        contentAlignment = Alignment.TopCenter
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(top = 80.dp)
                ) {
                    Spacer(modifier = Modifier.height(2.dp))

                    IconBox(
                        iconBox = IconBoxes.GREEN_MUY_GRANDE,
                        icon = R.drawable.huella
                    )

                    Spacer(modifier = Modifier.height(30.dp))
                    var text by remember { mutableStateOf("") }
                    TextField(
                        value = text,
                        onValueChange = { text = it },
                        placeholder = { Text("Jhon fingerprint") },
                        singleLine = true,
                        colors = TextFieldDefaults.colors(
                            focusedTextColor = colorResource(R.color.Void),
                            unfocusedTextColor = colorResource(R.color.Void),
                            disabledTextColor = colorResource(R.color.Void),
                            cursorColor = colorResource(R.color.Void),
                            focusedContainerColor = colorResource(R.color.Light_Green),
                            unfocusedContainerColor = colorResource(R.color.Light_Green),
                            disabledContainerColor = Color.LightGray,
                            focusedIndicatorColor =colorResource(R.color.Light_Green),
                            unfocusedIndicatorColor = colorResource(R.color.Light_Green),
                            disabledIndicatorColor = colorResource(R.color.Light_Green),
                            focusedPlaceholderColor = Color.Gray,
                            unfocusedPlaceholderColor = Color.Gray,
                            disabledPlaceholderColor = Color.LightGray
                        ),
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .fillMaxWidth(0.8f)
                    )
                    Spacer(modifier = Modifier.height(60.dp))

                    BotonDelete(navController)
                    Spacer(modifier = Modifier.height(40.dp))
                }

            }
        })}

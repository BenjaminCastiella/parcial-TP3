package com.example.parcialtp3_2.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.components.ViewBackground

@Composable

fun SuccessView(navController: NavController, modifier: Modifier) {
    // Implementación de la pantalla de éxito
    ViewBackground(
        false,
        0.00f,
        null,
        content1 = {
            Column (
                modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Box(
                    modifier = Modifier.size(142.dp),
                    contentAlignment = Alignment.Center,

                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.check),
                        contentDescription = "Success Checkmark",
                        modifier = Modifier.size(202.dp).clickable(
                            onClick = {
                                navController.navigate("menu")
                            }
                        ),
                        tint = Color(0xFFDFF7E2)
                    )

                }

                Text(
                    text = stringResource(R.string.success),
                    fontSize = 20.sp,
                    fontWeight = FontWeight(700),
                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top= 10.dp),
                    color = Color.White
                )





            }
        },
        content2 = {

        })
}
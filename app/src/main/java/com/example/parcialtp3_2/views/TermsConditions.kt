package com.example.parcialtp3_2.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.components.IconBox
import com.example.parcialtp3_2.components.Terminos
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.ui.theme.LeagueFamily
import com.example.parcialtp3_2.ui.theme.poppinsFamily

@Composable
fun TermsConditions(navController: NavController, modifier: Modifier){
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
                text = "Terms And Conditions",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                color = colorResource(R.color.Void),
                modifier = Modifier.absoluteOffset(x = 65.dp, y = 61.dp)


            )
        },

        content2 = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF1FFF3))
                    .padding(16.dp)
            ) {

                Terminos(navController)


                Spacer(modifier = Modifier.weight(20F))


                Button(
                    onClick = {  },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00D09E)),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(40.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(
                        text = "Accept",
                        color = colorResource(R.color.Void),
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    )
                }

                Spacer(modifier = Modifier.height(40.dp))
            }











        }
    )}
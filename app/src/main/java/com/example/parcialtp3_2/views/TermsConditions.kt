package com.example.parcialtp3_2.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.parcialtp3_2.code_behind.ViewsRoutes
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
                .align(Alignment.TopEnd)
                .padding( top = 61.dp,end = 25.dp)
                .clip(RoundedCornerShape(25.71.dp))
                .width(30.dp)
                .height(30.dp)


        ) {
            IconBox(iconBox = IconBoxes.LIGHT_GREEN, icon = R.drawable.vector)
        }
            Box(
                modifier = Modifier
                    .padding(start = 25.dp, top = 61.dp)
                    .clip(RoundedCornerShape(25.71.dp))
                    .width(30.dp)
                    .height(30.dp)
            ) {
                IconBox(iconBox = IconBoxes.GREEN, icon = R.drawable.flecha_back)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 61.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Terms And Conditions",
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    color = colorResource(R.color.Void),
                    modifier = Modifier

                )
            }
        },

        content2 = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(25.dp)

            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()

                ) {
                    Terminos(navController)

                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier.size(15.dp)
                        ) {
                            IconBox(iconBox = IconBoxes.CHECK, icon = R.drawable.check_terms)
                        }
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "I accept all the terms and conditions",
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.sp,
                            color = colorResource(R.color.Void)
                        )
                    }
                }
             Column(modifier = Modifier.fillMaxHeight(),
                 verticalArrangement = Arrangement.Bottom,
                 horizontalAlignment = Alignment.CenterHorizontally) {
                Button(
                    onClick = { navController.navigate(ViewsRoutes.SECURITY.getRoute())},
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00D09E)),
                    shape = RoundedCornerShape(30.dp),
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(20.dp)
                        .padding(bottom = 70.dp)
                ) {
                    Text(
                        text = "Accept",
                        color = colorResource(R.color.Void),
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    )
                }}
            }
        }










    )}
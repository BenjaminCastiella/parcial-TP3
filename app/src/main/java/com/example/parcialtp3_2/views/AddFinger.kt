package com.example.parcialtp3_2.views

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.components.BotonAdd
import com.example.parcialtp3_2.components.BotonDelete
import com.example.parcialtp3_2.components.IconBox
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.ui.theme.LeagueFamily
import com.example.parcialtp3_2.ui.theme.poppinsFamily

@Composable
fun AddFinger(navController: NavController, modifier: Modifier){
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
                    text = "Add FingerPrint",
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
                .systemBarsPadding(),
            contentAlignment = Alignment.TopCenter  ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(top = 80.dp)
                ) {
                    Spacer(modifier = Modifier.height(2.dp))

                    IconBox(
                        iconBox = IconBoxes.GREEN_MUY_GRANDE,
                        icon = R.drawable.huella
                    )

                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Use Fingerprint To Access. ",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        color = colorResource(R.color.Void),
                        textAlign = TextAlign.Center
                        )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing\nelit, sed do eiusmod tempor incididunt. ",
                        lineHeight = 10.sp,
                        fontFamily = LeagueFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        color = colorResource(R.color.Fence_Green),
                        textAlign = TextAlign.Center

                        )
                    Spacer(modifier = Modifier.height(60.dp))

                    BotonAdd(navController)
                    Spacer(modifier = Modifier.height(40.dp))

                }

            }
        })}

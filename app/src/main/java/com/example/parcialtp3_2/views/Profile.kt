package com.example.parcialtp3_2.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.ui.theme.poppinsFamily
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.components.IconBox
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.example.parcialtp3_2.components.ListProfile
import com.example.parcialtp3_2.components.VistaPerfil
import data.ItemsPerfil


@Composable
fun Profile(navController: NavController, modifier: Modifier) {
    ViewBackground(
        true,
        0.80f,
        navController,
        content1 = {

            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 61.dp, end = 25.dp)
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
                    text = "Profile",
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
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.TopCenter
            ) {
                Image(
                    painter = painterResource(id = R.drawable.foto),
                    contentDescription = "",
                    modifier = Modifier
                        .size(120.dp)
                        .offset(y = (-60).dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

                Column(
                    modifier = Modifier
                        .padding(top = 70.dp)
                        .align(Alignment.TopCenter),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "John Smith",
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = colorResource(R.color.Void)
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = buildAnnotatedString {
                            withStyle(style = SpanStyle(fontWeight = FontWeight.SemiBold)) {
                                append("ID:")
                            }
                            withStyle(style = SpanStyle(fontWeight = FontWeight.Light)) {
                                append("25030024")
                            }
                        },
                        fontFamily = poppinsFamily,
                        fontSize = 12.sp,
                        color = colorResource(R.color.Fence_Green),

                    )

                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 115.dp,start = 18.dp)
                ) {
                    VistaPerfil ({ route -> navController.navigate(route)},0)
                }
            }
        }
    )
}
package com.example.parcialtp3_2.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.code_behind.ViewsRoutes
import com.example.parcialtp3_2.components.IconBox
import com.example.parcialtp3_2.components.InputEditProfile
import com.example.parcialtp3_2.components.SwitchEditProfile
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.infraestructure.RetrofitClient
import com.example.parcialtp3_2.ui.theme.poppinsFamily

@Composable
fun EditProfile(navController: NavController, modifier: Modifier){
    ViewBackground(
        true,
        0.80f,
        null,
        content1 = {
            Box(
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
                    stringResource(R.string.edit_profile),
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    color = colorResource(R.color.Void),
                    modifier = Modifier

                )
            }
        },
        content2 = {LaunchedEffect(key1 = Unit) {
            val client = RetrofitClient()
            val res = client.getUser()
        }

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.TopCenter
            ) {Box(
                modifier = Modifier
                    .size(120.dp) // <-- Este Box define el área de 120dp x 120dp
                    .offset(y = (-0).dp), //
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

                Box(

                            modifier = Modifier.absoluteOffset(x = 90.dp, y = 30.dp)


                            ) {
                    IconBox(iconBox = IconBoxes.FOTO_EDIT, icon = R.drawable.icon_cam)
                }}


                Column(
                    modifier = Modifier
                        .padding(top = 70.dp)
                        .align(Alignment.TopCenter),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        stringResource(R.string.john_smith),
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = colorResource(R.color.Void)
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text =buildAnnotatedString {
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

                    Spacer(modifier = Modifier.height(10.dp))



                    Column(modifier = Modifier.padding(start = 8.dp, end=8.dp)) {

                        Text(
                            stringResource(R.string.account_settings),
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp,
                            color = colorResource(R.color.Void),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp, end=20.dp)
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        InputEditProfile(title = stringResource(R.string.user_name), placeholder = "John Smith")
                        InputEditProfile(title =stringResource(R.string.phone), placeholder = "+44 555 5555 55")
                        InputEditProfile(title = stringResource(R.string.email_address), placeholder = "example@example.com")

                        Spacer(modifier = Modifier.height(2.dp))

                        SwitchEditProfile(title = stringResource(R.string.push_notifications))
                        SwitchEditProfile(title = stringResource(R.string.turn_dark_theme))


                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Button(
                        onClick = { navController.navigate(ViewsRoutes.PROFILE.getRoute())},
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00D09E)),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth(0.5f)
                            .height(40.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.update_profile),
                            color = colorResource(R.color.Void),
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp
                        )
                    }











                }
                }
            }
    )
}
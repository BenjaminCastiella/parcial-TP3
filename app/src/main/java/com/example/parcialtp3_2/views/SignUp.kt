package com.example.parcialtp3_2.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import  androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.inputText
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.ViewsRoutes
import com.example.parcialtp3_2.components.confirmationButton
import com.example.parcialtp3_2.components.secretInputText

@Composable
fun SignUp(navController: NavController, modifier: Modifier){
    var email by remember { mutableStateOf("") }

    val updateEmail: (String) -> Unit = { newValue ->
        email = newValue
        println(email)
    }

    ViewBackground(
        false,
        0.80f,
        null,
        content1 = {
            Column (
                modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    stringResource(R.string.welcome),
                    modifier = modifier
                        .padding(top = 100.dp),
                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                    fontWeight = FontWeight(600),
                    fontSize = 30.sp
                )
            }
        },
        content2 = {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(modifier = Modifier.height(50.667.dp))

                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 45.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            stringResource(R.string.container_name),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                        )
                        inputText(
                            modifier = modifier,
                            initText = stringResource(R.string.container_label),
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 45.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            stringResource(R.string.container_password),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                        )

                        secretInputText(modifier = modifier, initText = stringResource(R.string.psw_message))
                    }


                    Spacer(modifier = Modifier.height(25.dp))

                    confirmationButton(modifier = Modifier,
                        initText = stringResource(R.string.log_in_button),
                        buttonColor = Color(0xFF00D09E),
                        esCreate = false,
                        onClick = {

                            navController.navigate(ViewsRoutes.HOME.getRoute())
                        }
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = stringResource(R.string.forgot_password),
                        fontSize = 15.sp,
                        fontWeight = FontWeight(600),
                        fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                        modifier = Modifier.clickable {
                            navController.navigate(ViewsRoutes.FORGOT_PSWD.getRoute())
                        }
                    )

                    Spacer(modifier = Modifier.height(25.dp))

                    Text(
                        text = buildAnnotatedString {
                            append("Sign Up")
                            withStyle(
                                style = SpanStyle(
                                    color = Color(0xFF0E3E3E),
                                ),
                            ){

                            }
                        },
                        modifier = Modifier
                            .clip(RoundedCornerShape(30.dp))
                            .width(195.dp)
                            .height(55.dp)
                            .background(Color(0xFFDFF7E2))
                            .padding(top = 15.dp)
                            .clickable{
                            navController.navigate(ViewsRoutes.CREATE_ACCOUNT.getRoute())
                        },
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(com.example.parcialtp3_2.R.font.poppins_semi_bold)),
                        textAlign = TextAlign.Center

                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = buildAnnotatedString {
                            append("Use ")
                            withStyle(
                                style = SpanStyle(
                                    color = Color(0xFF007BFF),
                                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                                    fontWeight = FontWeight(600)
                                ),
                            ){
                                append("Fingerprint")
                            }
                            append(" To Access")
                        },
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontWeight = FontWeight(500),
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text = stringResource(R.string.sign_up_with),
                        fontWeight = FontWeight(300)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.facebook),
                            modifier = Modifier.size(32.dp),
                            contentDescription = "Facebook"
                        )
                        Image(
                            painter = painterResource(R.drawable.google),
                            modifier = Modifier.size(32.dp),
                            contentDescription = "Google"
                        )
                    }
                    Text(
                        text = buildAnnotatedString {
                            append("Don't have an account? ")
                            withStyle(
                                style = SpanStyle(
                                    color = Color(0xFF007BFF),
                                    ),
                            ){
                                append("Sign Up")
                            }

                        },
                        modifier = Modifier.padding(top = 5.dp).clickable{
                            navController.navigate(ViewsRoutes.CREATE_ACCOUNT.getRoute())
                        },
                    )
                }
            }
        }
    )
}
package com.example.parcialtp3_2.views

import android.widget.Space
import androidx.compose.foundation.Image
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
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.ViewsRoutes
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.confirmationButton
import com.example.parcialtp3_2.components.inputText
import com.example.parcialtp3_2.components.pinCodeComponent

@Composable
fun SecurityPinView(navController: NavController, modifier: Modifier = Modifier) {
    ViewBackground(
        false,
        0.80f,
        null,
        content1 = {
            Column(
                modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    stringResource(R.string.security_pin),
                    modifier = Modifier.padding(top = 100.dp),
                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                    fontWeight = FontWeight.W600,
                    fontSize = 30.sp
                )
            }
        },
        content2 = {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(modifier = Modifier.height(90.667.dp))

                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Text(
                        stringResource(R.string.security_pin_description),
                        fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                        fontWeight = FontWeight.W600,
                        fontSize = 22.sp
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    pinCodeComponent(pinCode = stringResource(R.string.pin))

                    Spacer(modifier = Modifier.height(60.dp))

                    confirmationButton(
                        modifier = modifier.height(42.dp),
                        initText = "Accept",
                        navController = navController,
                        esCreate = false,
                        onClick = { }
                    )
                    confirmationButton(
                        modifier = modifier.height(42.dp),
                        initText = "Send Again",
                        buttonColor = Color(0xFFDFF7E2),
                        navController = navController,
                        esCreate = false,
                        onClick = { }
                    )

                    Spacer(modifier = Modifier.height(90.dp))

                    Text(
                        text = stringResource(R.string.sign_up_with),
                        fontWeight = FontWeight.W300
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
                                    color = Color(0xFF007BFF)
                                )
                            ) {
                                append("Sign Up")
                            }
                        },
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .clickable {
                                navController.navigate(ViewsRoutes.CREATE_ACCOUNT.getRoute())
                            }
                    )
                }
            }
        }
    )
}

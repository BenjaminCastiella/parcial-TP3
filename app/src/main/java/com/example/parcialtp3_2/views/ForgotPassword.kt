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
import androidx.compose.foundation.layout.width
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
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.confirmationButton
import com.example.parcialtp3_2.components.inputText

@Composable

fun ForgotPassword(navController: NavController, modifier: Modifier){
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
                    stringResource(R.string.forgot),
                    modifier = Modifier.padding(top = 100.dp),
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
                Spacer(modifier = Modifier.height(90.dp))


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
                            stringResource(R.string.reset),
                            fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                            fontWeight = FontWeight(600),
                            fontSize = 20.sp,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        Text(
                            stringResource(R.string.lorem),
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            fontSize = 9.sp,
                            modifier = Modifier.padding(bottom = 4.dp).width(359.dp),
                            lineHeight = 18.sp,
                        )

                        Spacer(Modifier.height(80.dp))

                        Text(
                            stringResource(R.string.emailAddress),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                            fontSize = 18.sp,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )

                        inputText(
                            modifier = Modifier.fillMaxWidth(),
                            initText = stringResource(R.string.container_label)
                        )


                    }

                    Spacer(modifier.height(20.dp))

                    confirmationButton(
                        modifier = Modifier.height(42.dp),
                        initText = stringResource(R.string.next_step_button),
                        buttonColor = Color(0xFF00D09E),
                        navController = navController,
                        esCreate = false
                    )

                    Spacer(modifier.height(50.dp))

                    confirmationButton(
                        modifier = Modifier.height(42.dp),
                        initText = stringResource(R.string.sign_up_button),
                        buttonColor = Color(0xFFDFF7E2),
                        navController = navController,
                        esCreate = false
                    )
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 20.dp)
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
                        modifier = Modifier.padding(top = 15.dp).clickable{
                            //Navigation to Sign Up Screen
                            navController.navigate("create_account")

                        },


                        )

                }
            }
        }

)
}

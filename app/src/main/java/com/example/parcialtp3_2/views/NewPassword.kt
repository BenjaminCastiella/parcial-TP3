package com.example.parcialtp3_2.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.confirmationButton
import com.example.parcialtp3_2.components.inputText
import com.example.parcialtp3_2.components.secretInputText

@Composable

fun NewPassword(navController: NavController, modifier: Modifier) {
    // Implementación de la pantalla de nueva contraseña
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
                    stringResource(R.string.new_password),
                    modifier = modifier
                        .padding(top = 80.dp),
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
                Spacer(modifier = Modifier.height(70.667.dp))


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
                            stringResource(R.string.new_password),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        secretInputText(
                            modifier = Modifier.fillMaxWidth(),
                            initText = stringResource(R.string.psw_message)
                        )

                        Spacer(modifier = Modifier.height(60.dp))
                        //confirm new password

                        Text(
                            stringResource(R.string.confirm),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        secretInputText(
                            modifier = Modifier.fillMaxWidth(),
                            initText = stringResource(R.string.psw_message)
                        )



                    }
                    Spacer(modifier.height(60.dp))

                    confirmationButton(modifier = Modifier
                        .padding(top = 60.dp, start = 30.dp, end = 30.dp).fillMaxWidth(),
                        initText = stringResource(R.string.change),
                        navController = navController,
                        esCreate = false
                    )
                }
            }
                }// content2
            )//viewbackground
        }//function


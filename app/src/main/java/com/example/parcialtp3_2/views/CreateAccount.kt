package com.example.parcialtp3_2.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.ViewsRoutes
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.confirmationButton
import com.example.parcialtp3_2.components.dateOfBirthdayInput
import com.example.parcialtp3_2.components.inputText
import com.example.parcialtp3_2.components.mobileNumberInput
import com.example.parcialtp3_2.components.secretInputText
import com.example.parcialtp3_2.infraestructura.AppDatabase
import com.example.parcialtp3_2.infraestructura.UserEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.Date


@Composable
fun CreateAccount(navController: NavController, modifier: Modifier, db: AppDatabase) {
    var email by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var mobileNum by remember { mutableStateOf("") }
    var birth by remember { mutableStateOf("") }

    val updateEmail: (String) -> Unit = { newValue ->
        email = newValue
        println(email)
    }

    val updateName: (String) -> Unit = { newValue ->
        name = newValue
        println(name)
    }

    val updateMobileNum: (String) -> Unit = { newValue ->
        mobileNum = newValue
        println(mobileNum)
    }

    val updateBirth: (String) -> Unit = { newValue ->
        birth = newValue
        println(birth)
    }

    val createUserOnBdd: suspend () -> Unit = {
        withContext(Dispatchers.IO) {
            var nextUid: Int
            var allUsers = db.userDao().getAll()
            if(allUsers.size < 1) nextUid = 1 else nextUid = allUsers.last().id + 1

            db.userDao().insert(UserEntity(
                id = nextUid,
                name = name,
                email = email,
                mobile_number = mobileNum,
                birth_date = birth,
                created_at = Date().toString()
            ))
        }
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
                    stringResource(R.string.create_account),
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
                Spacer(modifier = Modifier.height(17.dp))


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
                            stringResource(R.string.create_full_name),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        inputText(
                            modifier = Modifier.fillMaxWidth(),
                            initText = stringResource(R.string.container_label),
                            textState = name,
                            onChange = updateName
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    //Email Input
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 45.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            stringResource(R.string.create_email),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        inputText(
                            modifier = Modifier.fillMaxWidth(),
                            initText = stringResource(R.string.container_label),
                            textState = email,
                            onChange = updateEmail
                        )
                    }
                    //Mobile number Input

                    Spacer(modifier = Modifier.height(10.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 45.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            stringResource(R.string.create_mobile_number),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        mobileNumberInput(
                            modifier = Modifier.fillMaxWidth(),
                            initText = stringResource(R.string.create_mobile_number_content),
                            textState = mobileNum,
                            onChange = updateMobileNum
                        )
                    }
                    //Date of Birth Input
                    Spacer(modifier = Modifier.height(10.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 45.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            stringResource(R.string.create_date),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        dateOfBirthdayInput(
                            modifier = Modifier.fillMaxWidth(),
                            initText = stringResource(R.string.create_date_input),
                            textState = birth,
                            onChange = updateBirth
                        )
                    }

                    //password Input
                    Spacer(modifier = Modifier.height(10.dp))

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
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        secretInputText(
                            modifier = Modifier.fillMaxWidth(),
                            initText = stringResource(R.string.psw_message)
                        )
                    }
                    //Confirm password Input

                    Spacer(modifier = Modifier.height(10.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 45.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            stringResource(R.string.confirm_password),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                        secretInputText(
                            modifier = Modifier.fillMaxWidth(),
                            initText = stringResource(R.string.psw_message)
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = buildAnnotatedString {
                            append("By continuing, you agree to \n ")
                            withStyle(style = SpanStyle(color = Color.Black,
                                fontWeight = FontWeight(600))) {
                                append("Terms of Use")
                            }
                            append(" and ")
                            withStyle(style = SpanStyle(color = Color.Black,
                                fontWeight = FontWeight(600))) {
                                append("Privacy Policy")
                            }
                        },
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(horizontal = 45.dp)
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    confirmationButton(
                        modifier = Modifier,
                        initText = stringResource(R.string.sign_up_button),
                        buttonColor = Color(0xFF00D09E),
                        navController = navController,
                        esCreate = true,
                        onClick = createUserOnBdd
                    )
                    Spacer(Modifier.height(5.dp))
                    Text(
                        text = buildAnnotatedString {
                            append("Already have an account? ")
                            withStyle(
                                style = SpanStyle(
                                    color = Color(0xFF007BFF),
                                ),
                            ){
                                append("Log In")
                            }

                        },
                        modifier = Modifier.padding(top = 5.dp).clickable{
                            //Navigation to Sign Up Screen
                            navController.navigate(ViewsRoutes.SIGN_UP.getRoute())
                        },)

                }
            }
        })
}

package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp

@Composable
fun pinCodeComponent(
    pinLength: Int = 6,
    onPinChange: (String) -> Unit
) {
    val pinState = remember { mutableStateListOf(*Array(pinLength) { "" }) }
    val focusManager = LocalFocusManager.current // ✅ TOMARLO AQUÍ

    Row(
        modifier = Modifier.width(307.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        pinState.forEachIndexed { index, _ ->

            DigitCircleInput(
                value = pinState[index],
                onValueChange = { newDigit ->

                    pinState[index] = newDigit

                    // Avanzar
                    if (newDigit.isNotEmpty() && index < pinLength - 1) {
                        focusManager.moveFocus(FocusDirection.Next)  // ✅ USAR VARIABLE
                    }

                    // Retroceder
                    if (newDigit.isEmpty() && index > 0) {
                        focusManager.moveFocus(FocusDirection.Previous) // ✅
                    }

                    onPinChange(pinState.joinToString(""))
                }
            )
        }
    }
}


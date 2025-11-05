package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.ui.theme.poppinsFamily
import com.example.parcialtp3_2.R

@Composable
fun SwitchEditProfile(title: String) {
    var checked by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            fontFamily = poppinsFamily,
            fontSize = 14.sp,
            color = colorResource(R.color.Void)
        )
        Switch(
            checked = checked,
            onCheckedChange = { checked = it },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color(0xFFFFFFFF),
                uncheckedThumbColor = Color(0xFFFFFFFF),
                checkedTrackColor = Color(0xFF3AC7A0),
                uncheckedTrackColor = Color(0xFFDFF7E2),
                disabledUncheckedTrackColor = Color(0xFFF1FFF3),
                disabledUncheckedThumbColor = Color(0xFFFFFFFF)
            )
        )
    }
}
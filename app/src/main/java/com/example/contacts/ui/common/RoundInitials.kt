package com.example.contacts.ui.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.contacts.R

@Composable
fun RoundInitials(initials: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(0.75f) // явно задаем размер контейнера
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_circle),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            tint = Color.LightGray)
        Text(
            text = initials,
            color = Color.Black,
            fontSize = 20.sp
        )
    }
}
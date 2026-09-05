package com.example.contacts.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.contacts.R
import com.example.contacts.domain.Contact

@Composable
fun ContactPhoto(contact: Contact) {

    if (contact.imageRes == null) {
        Box(Modifier.fillMaxSize(0.5f),
            contentAlignment = Alignment.Center
        ) {
            RoundInitials("${contact.name.first()}${contact.surname?.first()}")
        }
    } else {
        Image(
            modifier = Modifier.fillMaxSize(0.5f),
            alignment = Alignment.Center,
            painter = painterResource(id = R.mipmap.flork),
            contentDescription = null,
            contentScale = ContentScale.Inside
        )
    }
}


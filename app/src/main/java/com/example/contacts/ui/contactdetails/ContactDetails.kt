package com.example.contacts.ui.contactdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.contacts.R
import com.example.contacts.domain.Contact
import com.example.contacts.ui.common.ContactPhoto
import com.example.contacts.ui.common.InfoRow

@Composable
fun ContactDetails(contact: Contact, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Box(Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)
            .background(colorResource(R.color.purple_500))
        ) {
            Text(
                text = stringResource(R.string.app_name),
                color = Color.White,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(16.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.25F)
                    .padding(bottom = 30.dp)
                ,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {

                ContactPhoto(contact)
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    style = MaterialTheme.typography.titleSmall,
                    text = "${contact.name} ${contact.surname.orEmpty()}")
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        style = MaterialTheme.typography.titleMedium,
                        text = contact.familyName
                    )
                    if (contact.isFavorite) Image(
                        modifier = Modifier.padding(start = 16.dp)
                            .align(Alignment.CenterVertically),
                        painter = painterResource(id = android.R.drawable.star_big_on),
                        contentDescription = null
                    )
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(0.75F),
            ) {
                InfoRow(stringResource(R.string.phone), contact.phone)
                InfoRow(stringResource(R.string.address), contact.address)
                InfoRow(stringResource(R.string.email), contact.email)
            }
        }
    }
}
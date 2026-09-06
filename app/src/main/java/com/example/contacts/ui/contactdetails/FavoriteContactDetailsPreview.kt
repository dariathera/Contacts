package com.example.contacts.ui.contactdetails

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.contacts.ui.mock_data.contact2
import com.example.contacts.ui.theme.ContactsTheme

@Preview(showBackground = true, showSystemUi = false,
    device = "spec:width=411dp,height=891dp"
)
@Composable
fun FavoriteContactDetailsPreview() {
    ContactsTheme {
        ContactDetails(contact2)
    }
}

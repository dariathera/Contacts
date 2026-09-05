package com.example.contacts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.contacts.ui.contactdetails.ContactDetails
import com.example.contacts.ui.mock_data.contact1
import com.example.contacts.ui.mock_data.contact2
import com.example.contacts.ui.theme.ContactsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val contact = contact1
        // val contact = contact2
        setContent {
            ContactsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ContactDetails(
                        contact = contact,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

package com.example.contacts.ui.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun InfoRow(left: String, right: String?) {
    var _right = right
    if (_right != null) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            if (_right!!.isEmpty()) {
                _right = "---"
            }
            Text(text = "%s: ".format(left), Modifier.weight(0.5f), textAlign = TextAlign.End)
            Text(text = _right, Modifier.weight(0.5f),)
            // string-resource позволяет поддерживать разные языки, менять порядок слов
            // annotatedString позволяет применять разное форматирование к разным частям текста
        }
    }
}

package presentation.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
fun SingleLineText(label: String, value: String) {
    Row {
        Text(text = label, fontWeight = FontWeight.Bold)
        Text(value)
    }
}
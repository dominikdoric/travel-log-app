package presentation.screens.homeScreen.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun BlogItem() {
    Card {
        Column() {
            Text("Blog title")
            Text("Blog description")
            Text("Blog timestamp")
        }
    }
}
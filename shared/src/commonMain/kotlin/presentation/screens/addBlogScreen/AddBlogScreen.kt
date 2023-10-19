package presentation.screens.addBlogScreen

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AddBlogScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Add blog") },
                backgroundColor = Color.Green.copy(alpha = 0.15f)
            )
        },
        content = {}
    )
}

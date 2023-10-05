package presentation.screens.blogDetailsScreen

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun BlogDetailsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Blog details") },
                backgroundColor = Color.LightGray
            )
        }
    ) {}
}

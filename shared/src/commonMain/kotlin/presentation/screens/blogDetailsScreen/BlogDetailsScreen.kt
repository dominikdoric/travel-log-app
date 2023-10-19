package presentation.screens.blogDetailsScreen

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import presentation.model.BlogUi
import presentation.screens.blogDetailsScreen.composables.BlogDetailsScreenContent

@Composable
fun BlogDetailsScreen(blog: BlogUi) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(blog.title) },
                backgroundColor = Color.LightGray
            )
        },
        content = { BlogDetailsScreenContent(blog = blog) }
    )
}

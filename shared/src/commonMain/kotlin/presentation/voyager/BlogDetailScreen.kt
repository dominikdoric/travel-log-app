package presentation.voyager

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import presentation.model.BlogUi
import presentation.screens.blogDetailsScreen.BlogDetailsScreen

data class BlogDetailScreen(val blog: BlogUi) : Screen {

    @Composable
    override fun Content() {
        BlogDetailsScreen(blog = blog)
    }
}
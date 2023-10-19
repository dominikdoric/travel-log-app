package presentation.voyager

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import presentation.screens.blogDetailsScreen.BlogDetailsScreen

data class BlogDetailScreen(val blogId: String): Screen {

    @Composable
    override fun Content() {
        BlogDetailsScreen()
    }
}
package presentation.screens.blogDetailsScreen.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import presentation.model.BlogUi

@Composable
fun BlogDetailsScreenContent(blog: BlogUi) {
    Column {
        Text(blog.id.toString())
        Text(blog.title)
        Text(blog.content)
        Text(blog.budget)
    }
}
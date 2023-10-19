package presentation.screens.blogDetailsScreen.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import presentation.model.BlogUi

@Composable
fun BlogDetailsScreenContent(blog: BlogUi) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(blog.id.toString())
        Text(blog.title)
        Text(blog.content)
        Text(blog.budget)
    }
}
package presentation.screens.homeScreen.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import presentation.model.BlogUi

@Composable
fun BlogItemsList(blogsList: List<BlogUi>) {
    LazyColumn {
        items(count = blogsList.size) { index ->
            val blog = blogsList[index]
            BlogItem(blog = blog)
        }
    }
}
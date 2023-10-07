package presentation.screens.homeScreen.composables

import alphaServer.tables.Blog
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable

@Composable
fun BlogItemsList(blogsList: List<Blog>) {
    LazyColumn {
        items(count = blogsList.size) { index ->
            val blog = blogsList[index]
            BlogItem(
                title = blog.title,
                description = blog.location,
                timestamp = blog.dateCreated
            )
        }
    }
}
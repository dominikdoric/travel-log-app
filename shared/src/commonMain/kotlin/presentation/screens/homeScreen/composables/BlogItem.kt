package presentation.screens.homeScreen.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import presentation.model.BlogUi
import presentation.voyager.AddBlogScreen
import presentation.voyager.BlogDetailScreen

@Composable
fun BlogItem(blog: BlogUi) {
    val navigator = LocalNavigator.currentOrThrow

    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .clickable { navigator.push(BlogDetailScreen(blog = blog)) },
        backgroundColor = Color.Green.copy(alpha = 0.05f),
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
        )
        {
            Text(blog.title)
            Text(blog.content)
            Text(blog.dateCreated)
        }
    }
}
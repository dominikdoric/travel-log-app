package presentation.screens.blogDetailsScreen.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import presentation.composables.SingleLineText
import presentation.model.BlogUi

@Composable
fun BlogDetailsScreenContent(blog: BlogUi) {
    Column(modifier = Modifier.padding(16.dp)) {
        Divider(thickness = 4.dp)
        SingleLineText(label = "Title: ", value = blog.title)
        SingleLineText(label = "Content: ", value = blog.content)
        SingleLineText(label = "Location: ", value = blog.location)
        SingleLineText(label = "Date: ", value = blog.dateCreated)
        SingleLineText(label = "Place to visit: ", value = blog.placeToVisit)
        SingleLineText(label = "Weather: ", value = blog.weather)
        SingleLineText(label = "Duration: ", value = blog.duration)
    }
}
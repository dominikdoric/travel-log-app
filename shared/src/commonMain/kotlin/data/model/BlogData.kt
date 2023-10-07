package data.model

import alphaServer.tables.Blog

data class BlogData(
    val id: Int = 0,
    val title: String = "",
    val content: String = "",
    val location: String = "",
    val dateCreated: String = "",
    val placeToVisit: String = "",
    val weather: String = "",
    val budget: String = "",
    val duration: String = ""
)

fun Blog.toBlogData(): BlogData {
    return BlogData(
        id = this.id,
        title = this.title,
        content = this.content,
        location = this.location,
        dateCreated = this.dateCreated,
        placeToVisit = this.placeToVisit,
        weather = this.weather,
        budget = this.budget,
        duration = this.duration
    )
}

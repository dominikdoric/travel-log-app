package domain.model

import data.model.BlogData

data class BlogDomain(
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

fun BlogData.toBlogDomain(): BlogDomain {
    return BlogDomain(
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

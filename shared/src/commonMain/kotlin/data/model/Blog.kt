package data.model

data class Blog(
    val id: Int,
    val location: String,
    val cost: Int,
    val placesToVisit: List<String>,
    val experience: String,
    val overview: String,
    val tips: String,
    val publicTransport: String,
    val picture: String
)

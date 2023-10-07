package alphaServer.server

import alphaServer.tables.Blog

interface TravelLogServer {
    suspend fun getBlogs(): List<Blog>
}

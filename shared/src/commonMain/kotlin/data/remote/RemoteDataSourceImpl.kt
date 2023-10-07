package data.remote

import alphaServer.server.TravelLogServer
import alphaServer.tables.Blog
import data.model.BlogData
import data.model.toBlogData

class RemoteDataSourceImpl(private val travelLogServer: TravelLogServer) : RemoteDataSource {
    override suspend fun getBlogs() = travelLogServer.getBlogs().map { it.toBlogData() }
}
package data.remote

import data.model.BlogData

interface RemoteDataSource {
    suspend fun getBlogs(): List<BlogData>
}
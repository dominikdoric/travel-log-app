package domain.useCases

import domain.repository.BlogsRepository
import presentation.model.toBlogUi

class GetBlogsUseCase(private val blogsRepository: BlogsRepository) {
    suspend operator fun invoke() = blogsRepository.getBlogs().map { it.toBlogUi() }
}
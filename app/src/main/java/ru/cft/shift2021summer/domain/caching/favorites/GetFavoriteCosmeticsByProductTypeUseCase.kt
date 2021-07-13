package ru.cft.shift2021summer.domain.caching.favorites

import ru.cft.shift2021summer.domain.caching.SavedCosmeticsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetFavoriteCosmeticsByProductTypeUseCase @Inject constructor(
    private val savedCosmeticsRepository: SavedCosmeticsRepository
){
    suspend operator fun invoke(name: String) =
        savedCosmeticsRepository.getFavoriteCosmeticsByProductType(name)
}
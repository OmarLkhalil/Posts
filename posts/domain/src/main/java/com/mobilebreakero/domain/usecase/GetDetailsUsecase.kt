package com.mobilebreakero.domain.usecase

import com.mobilebreakero.domain.repository.GetDetailsRepo

class GetDetailsUsecase (
    private val getDetailsRepo: GetDetailsRepo
) {
    suspend operator fun invoke(id: Int) = getDetailsRepo.getDetails(id)
}
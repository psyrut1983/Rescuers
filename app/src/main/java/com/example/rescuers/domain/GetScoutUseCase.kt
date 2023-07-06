package com.example.rescuers.domain

class GetScoutUseCase (private val scoutRepository: ScoutRepository) {
    fun getScout(scoutId: Int): Scout {
       return scoutRepository.getScout(scoutId)
    }
}
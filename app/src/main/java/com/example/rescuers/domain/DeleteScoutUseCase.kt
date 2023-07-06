package com.example.rescuers.domain

class DeleteScoutUseCase(private val scoutRepository: ScoutRepository) {
    fun deleteScout(scout: Scout) {
        scoutRepository.deleteScout(scout)
    }
}
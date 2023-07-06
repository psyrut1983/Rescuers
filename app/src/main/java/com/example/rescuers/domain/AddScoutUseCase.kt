package com.example.rescuers.domain

class AddScoutUseCase(private val scoutRepository: ScoutRepository) {
    fun addScout(scout: Scout) {
        scoutRepository.addScout(scout)
    }

}
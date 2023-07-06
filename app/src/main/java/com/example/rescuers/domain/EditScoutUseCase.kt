package com.example.rescuers.domain

class EditScoutUseCase(private val scoutRepository: ScoutRepository) {
    fun editScout(scout: Scout) {
        scoutRepository.editScout(scout)
    }
}
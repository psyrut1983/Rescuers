package com.example.rescuers.domain

class GetScoutUseCase (private val scoutRepository: ScoutRepository) {
    fun getScout(scout: Scout): Scout {
       return scoutRepository.getScout(scout)
    }
}
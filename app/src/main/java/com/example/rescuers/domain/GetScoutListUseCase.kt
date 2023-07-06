package com.example.rescuers.domain

class GetScoutListUseCase(private val scoutRepository: ScoutRepository) {

    fun getScoutList(): List<Scout>{
        return scoutRepository.getScoutList()
    }
}
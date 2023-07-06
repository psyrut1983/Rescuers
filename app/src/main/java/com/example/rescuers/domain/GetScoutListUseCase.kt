package com.example.rescuers.domain

import androidx.lifecycle.LiveData

class GetScoutListUseCase(private val scoutRepository: ScoutRepository) {

    fun getScoutList(): LiveData<List<Scout>> {
        return scoutRepository.getScoutList()
    }
}
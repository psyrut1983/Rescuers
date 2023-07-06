package com.example.rescuers.domain

class CreateQrUseCase(private val scoutRepository: ScoutRepository) {
    fun createQr(scout: Scout) {
        scoutRepository.createQr(scout)
    }
}
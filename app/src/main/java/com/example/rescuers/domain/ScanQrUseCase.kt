package com.example.rescuers.domain

class ScanQrUseCase (private val scoutRepository: ScoutRepository) {
    fun scanQr(){
scoutRepository.scanQr()
    }
}
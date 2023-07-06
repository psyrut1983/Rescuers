package com.example.rescuers.domain

interface ScoutRepository {
    fun addScout(scout: Scout)
    fun deleteScout (scout: Scout)
    fun editScout (scout: Scout)
    fun getScout(scoutId: Int): Scout
    fun getScoutList(): List<Scout>
    fun createQr (scout: Scout)
    fun scanQr()
}
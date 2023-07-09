package com.example.rescuers.domain

import androidx.lifecycle.LiveData

interface ScoutRepository {
    fun addScout(scout: Scout)
    fun deleteScout (scout: Scout)
    fun editScout (scout: Scout)
    fun getScout(scoutId: Int): Scout
    fun getScoutList(): LiveData<List<Scout>>
    fun createQr (scout: Scout)
    fun scanQr(text:String)
}
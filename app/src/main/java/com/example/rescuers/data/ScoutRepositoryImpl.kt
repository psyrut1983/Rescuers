package com.example.rescuers.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.rescuers.domain.Scout
import com.example.rescuers.domain.ScoutRepository

object ScoutRepositoryImpl : ScoutRepository {
    private val scoutListLD = MutableLiveData<List<Scout>>()
    private val scoutList = mutableListOf<Scout>()
    private var autoIncrementId=0

init {
    for (i in 0 until 10) {
        val scout = Scout("Name $i",
            "family $i",
            "hero $i",
        false,
        false)
        addScout(scout)
    }
}


    override fun addScout(scout: Scout) {
        if (scout.id == Scout.UNDEFINED_ID) {
        scout.id = autoIncrementId++
        }
        scoutList.add(scout)
        updateList()
    }

    override fun deleteScout(scout: Scout) {
        scoutList.remove(scout)
        updateList()
    }

    override fun editScout(scout: Scout) {
        val oldElement = getScout(scout.id)
        scoutList.remove(oldElement)

        addScout(scout)
    }

    override fun getScout(scoutId: Int): Scout {
        return scoutList.find { it.id == scoutId
        } ?: throw RuntimeException("Element with id:${scoutId} not found")
    }

    override fun getScoutList(): LiveData<List<Scout>> {
        return scoutListLD
    }

    override fun createQr(scout: Scout) {
        TODO("Not yet implemented")
    }

    override fun scanQr() {
        TODO("Not yet implemented")
    }

    private fun updateList(){
        scoutListLD.value = scoutList.toList()
    }

}
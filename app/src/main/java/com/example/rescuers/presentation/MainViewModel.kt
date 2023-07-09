package com.example.rescuers.presentation

import androidx.compose.runtime.Composable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rescuers.data.ScoutRepositoryImpl
import com.example.rescuers.domain.DeleteScoutUseCase
import com.example.rescuers.domain.EditScoutUseCase
import com.example.rescuers.domain.GetScoutListUseCase
import com.example.rescuers.domain.Scout

class MainViewModel : ViewModel() {
    private val repository = ScoutRepositoryImpl


    private val getScoutListUseCase = GetScoutListUseCase(repository)
    private val deleteScoutUseCase = DeleteScoutUseCase(repository)
    private val editScoutUseCase = EditScoutUseCase(repository)

    val scoutList = getScoutListUseCase.getScoutList()


    @Composable
    fun deleteScout(scout: Scout) {
        deleteScoutUseCase.deleteScout(scout)
    }

    @Composable
    fun changeHaveACarState(scout: Scout) {
        val newScout = scout.copy(haveACar = !scout.haveACar)
        editScoutUseCase.editScout(newScout)
    }
}
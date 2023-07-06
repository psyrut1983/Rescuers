package com.example.rescuers.domain

data class Scout(
    val id: Int,
    val FirstName: String,
    val SecondName: String,
    val callSign: String,
    val haveACar: Boolean,
    val isALeader: Boolean
)

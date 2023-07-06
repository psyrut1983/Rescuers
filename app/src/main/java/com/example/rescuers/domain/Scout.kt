package com.example.rescuers.domain

data class Scout(
    val FirstName: String,
    val SecondName: String,
    val callSign: String,
    val haveACar: Boolean,
    val isALeader: Boolean,
    var id: Int = UNDEFINED_ID
)

{
    companion object {
        const val UNDEFINED_ID = -1
    }
}


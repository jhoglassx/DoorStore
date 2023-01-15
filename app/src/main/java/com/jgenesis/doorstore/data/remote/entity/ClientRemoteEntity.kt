package com.jgenesis.doorstore.data.remote.entity

data class ClientRemoteEntity(
    val id: Int,
    val name: String,
    val address: String,
    val email: String,
    val phone: Int,
    val dateCreate: String,
    val dateUpdate: String
)

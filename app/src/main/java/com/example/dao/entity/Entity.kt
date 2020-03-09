package com.example.dao.entity

interface Entity {
    fun merge(item: Entity) : Entity
}
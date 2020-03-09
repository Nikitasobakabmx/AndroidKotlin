package com.example.dao.repository

import com.example.dao.entity.Entity

interface Repository{
    fun append(item: Entity) : Entity
    fun delete(item: Entity) : Entity
    fun delete(index: Int = 0) : Entity
    fun update(item: Entity) : Entity
    fun get(index:Int = 0) : Entity
    fun isExists(item: Entity) : Entity
}
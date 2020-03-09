package com.example.dao.entity

class MarkEntity(
        var _MarkID : Long = 0,
        var _Type : String = ""
) : Entity {


    override fun merge(item: Entity): Entity {
        if (item is MarkEntity)
            _Type = item._Type
        return this
    }
}
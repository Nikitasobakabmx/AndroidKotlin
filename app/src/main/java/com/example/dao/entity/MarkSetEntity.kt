package com.example.dao.entity

class MarkSetEntity(
        var _MarkSetID:Long = 0,
        var _MarkID : Long = 0,
        var _PersonID  :Long = 0
) : Entity {

    override fun merge(item: Entity): Entity {
        if (item is MarkSetEntity){
            _MarkID = item._MarkID
            _PersonID = item._PersonID
        }
        return this
    }

}
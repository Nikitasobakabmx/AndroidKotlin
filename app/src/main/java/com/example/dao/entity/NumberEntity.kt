package com.example.dao.entity

class NumberEntity (var _PhoneID:Long = 0,
                    var _PersonID : Long = 0,
                    var _Number : String = ""): Entity {
    override fun merge(item: Entity): Entity {
        if (item is NumberEntity) {
            _PersonID = item._PhoneID
            _Number = item._Number
        }
        return this
    }

}
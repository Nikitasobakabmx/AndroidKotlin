package com.example.dao.entity

import androidx.core.graphics.createBitmap
import com.example.support.Date
import com.example.support.Status
import com.example.support.Time
import java.lang.NullPointerException

class CallDetailsEntity(
    var _CallDetailsID : Long = 0,
    var _PhoneID : Long = 0,
    var _Date : Date? = null,
    var _Time:Time? = null,
    var _Duration:Time? = null,
    var _Status : String = ""
) : Entity {

    override fun merge(item: Entity): Entity {
        if (item is CallDetailsEntity) {
            _PhoneID = item._PhoneID
            _Date = item._Date
            _Time = item._Time
            _Duration = item._Duration
            _Status = item._Status
        }
        return this
    }
}
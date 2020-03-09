package com.example.dao.entity

import com.example.support.Date

class PersonEntity(private var _CallDetailsID: Long = 0,
                   var _PersonID : Long = 0,
                   var _Name : String = "",
                   var _Surname : String? = null,
                   var _Patrinumic : String? = null,
                   var _Photo : String? = null,
                   var _Description : String? = null,
                   var _DateOfBirth : Date? = null) : Entity {

    /*
    * everything can change, except current id
    * */
    override fun merge(item: Entity): Entity {
        if (item is PersonEntity){
            _PersonID = item._PersonID
            _Name = item._Name
            if (item._Surname != null && item._Surname != _Surname)
                _Surname = item._Surname
            if (item._Patrinumic != null && item._Patrinumic != _Patrinumic)
                _Patrinumic = item._Patrinumic
            if (item._Photo != null && item._Photo != _Photo)
                _Photo = item._Photo
            if (item._Description != null && item._Description != _Description)
                _Description = item._Description
            if (item._DateOfBirth != null && item._DateOfBirth != _DateOfBirth)
                _DateOfBirth = item._DateOfBirth
        }
        return this
    }

    

}
package com.example.dao.repository

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import com.example.dao.entity.Entity
import com.example.dao.entity.PersonEntity
import com.example.support.*

class PersonRepository(private var _dbHelper : DataBaseHelper,
                       private var _database : SQLiteDatabase
) : Repository {

    private val _TABLE = PERSON_TABLE
    private val _ID = PERSON_ID
    private val _NAME = NAME
    private val _SURNAME = SURNAME
    private val _PATRONYMIC = PATRONYMIC
    private val _PHOTO = PHOTO
    private val _DESCRIPTION = DESCRIPTION
    private val _DATE_OF_BIRTH = DATE_OF_BIRTH


    override fun append(item: Entity): Entity {
        var cv = ContentValues()
        if (item is PersonEntity){
            cv.put(_ID, item._PersonID)
            cv.put(_NAME, item._Name)
            cv.put(_SURNAME, item._Surname)
            cv.put(_PATRONYMIC, item._Patrinumic)
            cv.put(_PHOTO, item._Photo)
            cv.put(_DESCRIPTION, item._Description)
            cv.put(_DATE_OF_BIRTH, item._DateOfBirth.toString())
        }
        _database.insert(_TABLE, null, cv)
        return item
    }

    override fun delete(item: Entity): Entity {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(index: Int): Entity {


    }

    override fun update(item: Entity): Entity {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(index: Int): Entity {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isExists(item: Entity): Entity {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
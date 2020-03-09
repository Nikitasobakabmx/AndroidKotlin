package com.example.dao.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.os.strictmode.SqliteObjectLeakedViolation
import com.example.support.DataBaseHelper

class RepositoryFactory(context: Context) {

    private var _dbHelper:DataBaseHelper = DataBaseHelper(context.applicationContext)
    private var _database : SQLiteDatabase = _dbHelper.writableDatabase

    fun open () : RepositoryFactory {
        _database = _dbHelper.writableDatabase
        return this
    }

    fun close () {
        _dbHelper.close()
    }

    fun get_repository(type : RepositoryKind) : Repository? = when (type){
        RepositoryKind.CALL_DETAILS -> CallDetailsRepository(_dbHelper, _database) as Repository
        RepositoryKind.MARK -> MarkRepository(_dbHelper, _database) as Repository
        RepositoryKind.MARK_SET -> MarkSetRepository(_dbHelper, _database) as Repository
        RepositoryKind.NUMBER -> NumberRepository(_dbHelper, _database) as Repository
        RepositoryKind.PERSON -> PersonRepository(_dbHelper, _database) as Repository
    }
}
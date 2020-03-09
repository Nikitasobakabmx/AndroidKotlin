package com.example.dao.repository

import android.database.sqlite.SQLiteDatabase
import com.example.support.DataBaseHelper

class CallDetailsRepository(private var _dbHelper : DataBaseHelper,
                            private var _database : SQLiteDatabase
) : Repository{
    override fun append(item: Repository): Repository {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(item: Repository): Repository {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(index: Int): Repository {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(item: Repository): Repository {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(index: Int): Repository {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isExists(item: Repository): Repository {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
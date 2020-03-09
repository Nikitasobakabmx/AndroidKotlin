package com.example.support

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.testapp.R
import java.io.BufferedReader
import java.io.InputStreamReader

class DataBaseHelper(var context: Context?) : SQLiteOpenHelper(context, DATA_BASE_NAME, null, SCHEMA) {

    override fun onCreate(db: SQLiteDatabase?) {
        var initArray = _parseSQL(R.raw.init)
        for( i in initArray)
            db?.execSQL(i)
        var populateArray = _parseSQL(R.raw.populate)
        for(i in populateArray)
            db?.execSQL(i)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /*
    * !!!!!!!!!!!!!!!!!!!!!!!!!!! need recode !!!!!!!!!!!!!!!!!!!
    * */
    private fun _parseSQL(sorce:Int) : Array<String> {
        var array = emptyArray<String>()
        var istream = context?.resources?.openRawResource(sorce)
        var buff =  BufferedReader(InputStreamReader(istream))
        while(buff.ready()) {
            var tmpStringArr: Array<String> = emptyArray()
            do {
                tmpStringArr += buff.readLine()
            } while (tmpStringArr[-1][0] != ';')
            array += tmpStringArr.joinToString("\n")
        }
        return array
    }

}
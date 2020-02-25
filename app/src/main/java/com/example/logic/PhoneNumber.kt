package com.example.logic

import android.view.View

class PhoneNumber(){

    private var _str:String = "8-900-000-00-00"
    private var _maxLength = "8-900-000-00-00".length

    fun clear():String{
        _str = "8-900-000-00-00"
        return _str
    }

    fun rm():String{
        if(_str == "8-900-000-00-00")
            return _str
        _str = _str.dropLast(1)
        if (_str.length == 3    ||
            _str.length == 7    ||
            _str.length == 11   ||
            _str.length == 14   )
            _str = _str.dropLast(1)
        if(_str == "")
            return clear()
        return _str
    }

    fun append(number:String):String{
        if(_str == "8-900-000-00-00")
            _str = ""
        if(_str.length == _maxLength)
            return _str
        if (_str.length == 0    ||
            _str.length == 4    ||
            _str.length == 8    ||
            _str.length == 11   )
            _str += "$number-"
        else
            _str += number
        return _str
        }

    fun test(view: View){

    }

}
package com.example.support

class Date() {

    var day = 0
    var month = 0
    var year = 0
    constructor(DateInStr:String) : this(){

    }
    override fun toString() : String{
        return "$year-$month-$day"
    }

}
package com.example.testapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.logic.PhoneBook

class ContactActivity : Activity(){

    private var _phoneBook = PhoneBook()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contacts_layout)
    }

    // bottom button
    fun phoneClick(view: View){
        var nextAct: Intent = Intent(this, PhoneActivity::class.java)
        startActivity(nextAct)
    }
    fun contactsClick(view: View){
        //var intent: Intent = Intent(this, ContactActivity::class.java)
        //startActivity(intent)
    }
    fun storyClick(view: View){
        var nextAct: Intent = Intent(this, StoryActivity::class.java)
        startActivity(nextAct)
    }
}
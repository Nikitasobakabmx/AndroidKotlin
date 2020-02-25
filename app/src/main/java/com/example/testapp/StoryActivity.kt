package com.example.testapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import com.example.logic.CallHistory

class StoryActivity : Activity(){

    private var _callHistory = CallHistory()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.story_layout)
    }

    // bottom button
    fun phoneClick(view: View){
        var nextAct: Intent = Intent(null, PhoneActivity::class.java)
        startActivity(nextAct)
    }
    fun contactsClick(view: View){
        var nextAct: Intent = Intent(this, ContactActivity::class.java)
        startActivity(nextAct)
    }
    fun storyClick(view: View){
        //var intent: Intent = Intent(this, StoryActivity::class.java)
        //startActivity(intent)
    }
}
package com.example.testapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.logic.PhoneNumber


class PhoneActivity : Activity() {

    private var _phoneNumber:PhoneNumber = PhoneNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phone_layout)
    }
    fun onClick(view: View){
        var number = findViewById<TextView>(R.id.phone_number)
        var button:Button = view as Button
        number.setText(_phoneNumber.append(button.text.toString()))
    }
    fun clear(view:View) {
        var number = findViewById<TextView>(R.id.phone_number)
        number.setText(_phoneNumber.rm())
    }

    // bottom button
    fun phoneClick(view:View){
        //var intent: Intent = Intent(this, PhoneActivity::class.java)
        //startActivity(intent)
    }
    fun contactsClick(view:View){
        var nextAct = Intent(this, ContactActivity::class.java)
        startActivity(nextAct)
    }
    fun storyClick(view:View){
        var nextAct= Intent(this, StoryActivity::class.java)
        startActivity(nextAct)
    }

}
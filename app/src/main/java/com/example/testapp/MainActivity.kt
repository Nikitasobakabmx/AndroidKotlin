package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView as TextView1

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textViwe = TextView1(this)
        textViwe.setText("HelloWorld")
        textViwe.setTextSize(22.0F)
        setContentView(textViwe)
    }
}

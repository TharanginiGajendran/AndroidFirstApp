package com.example.day1androidrevision

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TestLooperManager
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var getName = findViewById<TextView>(R.id.getName)

        getName.text = "${intent.getStringExtra("name").toString()}, you will get more offers"
    }
}
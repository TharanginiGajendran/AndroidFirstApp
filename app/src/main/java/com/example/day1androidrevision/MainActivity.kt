package com.example.day1androidrevision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.security.interfaces.EdECKey

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterName = findViewById<EditText>(R.id.et_user_name)
        val submitName = findViewById<Button>(R.id.submit_btn)
        val message = findViewById<TextView>(R.id.welcome_msg)
        submitName.setOnClickListener {

            var text = "Welcome ${enterName.text.toString()}"
            message.text = text

//            Toast.makeText(this.applicationContext, text, Toast.LENGTH_LONG).show()

        }
    }


}
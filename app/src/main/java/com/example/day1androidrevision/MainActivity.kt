package com.example.day1androidrevision

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewListeners()
    }

    private fun viewListeners() {
        val enterName = findViewById<EditText>(R.id.et_user_name)
        val submitName = findViewById<Button>(R.id.submit_btn)
        val message = findViewById<TextView>(R.id.welcome_msg)
        val nexBtn = findViewById<Button>(R.id.next_btn)

        var name = ""
        submitName.setOnClickListener {
            name = enterName.text.toString()
            if (name == "") {
                message.text = "The Name should not be empty"
                Toast.makeText(this@MainActivity, "please enter your name", Toast.LENGTH_LONG)
                    .show()
                nexBtn.visibility = View.INVISIBLE
            } else {
                nexBtn.visibility = View.VISIBLE
                val text = "Welcome $name"
                message.text = text
                enterName.text.clear()
            }
        }

        nexBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("name",name)
            startActivity(intent)
        }

    }

}
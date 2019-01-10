package com.example.maksy.labwork

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class HelloNameActivity : AppCompatActivity() {
    lateinit var clearButton : ImageButton
    lateinit var sayHelloButton : Button
    lateinit var nameEditText : EditText
    lateinit var nameTextView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_name)
        clearButton = findViewById(R.id.clear_button)
        sayHelloButton = findViewById(R.id.say_hello_button)
        nameEditText = findViewById(R.id.name_edit_text)
        nameTextView = findViewById(R.id.hello_text_view)

        sayHelloButton.setOnClickListener {
            val name = nameEditText.text.toString()
            nameTextView.text = ("Hello $name")
        }
        clearButton.setOnClickListener {
           nameEditText.setText("")
        }
    }
}
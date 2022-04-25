package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener{

        }
    }
    private fun addnumber(view: View){
        val editText=findViewById<EditText>(R.id.number1)
        val nicknameTextView.text=editText.text

        editText.visibility=View.GONE

    }
}
package com.asyno.simpleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val mGreetings = Greetings()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnOK = findViewById<Button>(R.id.btnOK)

        btnOK.setOnClickListener { v -> onClickOK() }
    }

    fun onClickOK(){
        val etName = findViewById<EditText>(R.id.etName)
        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        val gr = mGreetings.get()
        val name = etName.text.toString()
        tvHeader.text = "$gr $name"
    }
}
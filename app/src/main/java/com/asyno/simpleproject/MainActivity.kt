package com.asyno.simpleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mGreetingsEnglish = GreetingsEnglish()
    val mGreetingsDanish = GreetingsDanish()
    val mMale = Male()
    val mFemale = Female()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnENG = findViewById<Button>(R.id.btnENG)
        val btnDA = findViewById<Button>(R.id.btnDA)

        btnENG.setOnClickListener { v -> onClickEng() }
        btnDA.setOnClickListener { v -> onClickDA() }
    }


    fun onClickEng(){
        val maleView = findViewById<ImageView>(R.id.imageMale)
        val femaleView = findViewById<ImageView>(R.id.imageFemale)
        val etName = findViewById<EditText>(R.id.etName)

        //val tvHeader = findViewById<TextView>(R.id.tvHeader)
        val tvHeader = tvHeader

        val grENG = mGreetingsEnglish.get()

        val name = etName.text.toString()

        if (mMale.get().contains(name)){
            maleView.visibility = View.VISIBLE
            femaleView.visibility = View.INVISIBLE
        }

        if (mFemale.get().contains(name)){
            femaleView.visibility = View.VISIBLE
            maleView.visibility = View.INVISIBLE
        }

        if (!mMale.get().contains(name) && !mFemale.get().contains(name)) {
            femaleView.visibility = View.INVISIBLE
            maleView.visibility = View.INVISIBLE
        }

        tvHeader.text = "$grENG $name"
    }

    fun onClickDA(){
        val maleView = findViewById<ImageView>(R.id.imageMale)
        val femaleView = findViewById<ImageView>(R.id.imageFemale)
        val etName = findViewById<EditText>(R.id.etName)
        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        val grDA = mGreetingsDanish.get()

        val name = etName.text.toString()

        if (mMale.get().contains(name)){
            maleView.visibility = View.VISIBLE
            femaleView.visibility = View.INVISIBLE
        }

        if (mFemale.get().contains(name)){
            femaleView.visibility = View.VISIBLE
            maleView.visibility = View.INVISIBLE
        }

        if (!mMale.get().contains(name) && !mFemale.get().contains(name)) {
            femaleView.visibility = View.INVISIBLE
            maleView.visibility = View.INVISIBLE
        }

        tvHeader.text = "$grDA $name"
    }
}
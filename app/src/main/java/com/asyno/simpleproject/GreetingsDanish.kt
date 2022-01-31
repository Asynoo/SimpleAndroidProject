package com.asyno.simpleproject

import java.util.*

class GreetingsDanish {
    private val generator = Random()
    val greetingText = arrayOf("Godmorgen", "Godaften", "Godeftermiddag", "Tillykke Med Fødselsdagen")

    public fun get(): String {
        val idx = generator.nextInt(greetingText.size)
        return greetingText[idx];
    }
}
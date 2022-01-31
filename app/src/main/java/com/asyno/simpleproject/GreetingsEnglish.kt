package com.asyno.simpleproject

import java.util.*

class GreetingsEnglish {

    private val generator = Random()
    val greetingText = arrayOf("Good Morning", "Good Evening", "Good Afternoon", "Happy Birthday")

    public fun get(): String {
        val idx = generator.nextInt(greetingText.size)
        return greetingText[idx];
    }
}
package com.asyno.simpleproject

import java.util.*

class Greetings {

    private val generator = Random()
    val greetingText = arrayOf("Hello", "Hey", "Dear", "Have a nice day")

    public fun get(): String {
        val idx = generator.nextInt(greetingText.size)
        return greetingText[idx];
    }
}
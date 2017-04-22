package com.iplusd.victor.myplayer

/**
 * Created by victor on 22/4/17.
 *
 */


interface Person {
    val name: String
    val age: Int

    fun getDescription() = "Name: $name, age: $age"
}

class Developer(override val name: String, override val age: Int) : Person

fun text() {
    val person = Developer("Víctor", 34)
    val name = person.name
    person.getDescription()
}
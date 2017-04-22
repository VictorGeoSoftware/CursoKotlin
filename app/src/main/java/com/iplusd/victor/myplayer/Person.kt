package com.iplusd.victor.myplayer

/**
 * Created by victor on 22/4/17.
 *
 */


class Person(name:String, age:Int) {
    var name = name
    get() = "Name : $field"
    set(value) {
        if (value.isNotEmpty()) {
            field = value
        }
    }

    var age = age
}

fun text() {
    val person = Person("Víctor", 31)
    val name = person.name
    person.name = "Alexis"
}
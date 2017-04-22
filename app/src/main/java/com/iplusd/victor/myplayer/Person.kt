package com.iplusd.victor.myplayer

/**
 * Created by victor on 22/4/17.
 *
 */

// Si no se pone val/var, no lo toma como campo!!
open class Person(val name:String, val age:Int)

// ------ Clase hija
class Developer(name:String) : Person(name, 24)

// ------ Clase hija
class Developer1(val name:String = "", val age: Int = 20)


// ------ Clase hija personalizada
class MyClass {
    val name:String
    val age:Int

    constructor(name:String) {
        this.name = name
        this.age = 20
    }

    constructor(age:Int) {
        this.name = "Nadie"
        this.age = age
    }
}

fun test() {
    val person = Person("Name", 20)
    person.name
    val myVal = MyClass(age = 25)
}
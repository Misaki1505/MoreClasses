package com.example.moreclasses

fun main(args: Array<String>) {
    val myCarro = Carro()
    myCarro.speed = 100
    println("car.name ${myCarro.name}")
    println("car.speed ${myCarro.speed}")
}

class Carro {
    var name = ""
    var speed: Int
        get() = 50
        set(value) {
            name = "High speed car $value"
        }
}
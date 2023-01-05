package com.example.moreclasses

fun main(args: Array<String>) {
    val myCar = Car()
    val yourCar = Car("BMW")
    val hisCar = Car("fiat", 220)
}

class Car {
    constructor() {
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newTopSpeed: Int) {
        model = newModel
        topSpeed = newTopSpeed
    }

    var model: String? = null
    var topSpeed = 100
}
package com.example.moreclasses

fun main(args: Array<String>) {
    val newLaptop = Laptop("Windows 10")

}

class Laptop(val operatingSystem: String) {
    init {
        println("operating system $operatingSystem is installing")
    }
}
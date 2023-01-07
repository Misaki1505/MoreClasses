package com.example.moreclasses

fun main(args: Array<String>) {
    val user1 = UserAccount()
    val user2 = UserAccount("John")
    val user3 =UserAccount("Mary",175)
    val user4 = UserAccount("Anna", 2635)
}

class UserAccount {
    constructor(){
        userName = "Generic User"
        balance = 1
        canAfford()
    }

    constructor(newUserName: String){
        userName = newUserName
        balance = 2
        canAfford()
    }

    constructor(newUserName: String, newBalance: Int){
        userName = newUserName
        balance = newBalance
        canAfford()
    }

    var userName = "User name"
    var balance = 0
    val tShirtPrice = 20

    fun canAfford() {
        if(balance > tShirtPrice) {
            println("$userName can afford ${balance/tShirtPrice} tshirts")
        } else {
            println("$userName cannot afford any tshirts")
        }
    }
}
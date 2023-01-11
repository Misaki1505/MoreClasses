package com.example.moreclasses

fun main(args: Array<String>) {
    val account = BankAccount2()
    account.amount = 500
    account.amount = 1000
    account.amount = 15000
}

class BankAccount2 {
    var interestRate = 0.0
    var amount: Int = 0
        get() = field
        set(value) {
            if(value < 1000)
                interestRate = 1.0
            else if(value < 10000)
                interestRate = 0.5
            else
                interestRate = 0.2
            field =value
            println("The cliente has $value and an interest rate of $interestRate")
        }
}
package org.example.lesson_16

import kotlin.random.Random
import kotlin.random.nextInt


class Dice {
    private val number = Random.nextInt(1..6)

    fun getNumber() = number
}


fun main() {
    println("На кубике выпало число ${Dice().getNumber()}")
}

package org.example.lesson_18

import kotlin.random.Random
import kotlin.random.nextInt

abstract class Dice {
    abstract fun getNumber(): String
}

class FourSidedDice : Dice() {
    private val numberOfSides: Int = 4
    private val number = Random.nextInt(1..numberOfSides)

    override fun getNumber() = "На четырёхгранной кости выпало число $number"
}

class SixSidedDice : Dice() {
    private val numberOfSides: Int = 6
    private val number = Random.nextInt(1..numberOfSides)

    override fun getNumber() = "На шестигранной кости выпало число $number"
}

class EightSidedDice : Dice() {
    private val numberOfSides: Int = 8
    private val number = Random.nextInt(1..numberOfSides)

    override fun getNumber() = "На восьмигранной кости выпало число $number"
}

fun main() {
    val dice4 = FourSidedDice()
    val dice6 = SixSidedDice()
    val dice8 = EightSidedDice()

    val listOfDice: List<Dice> = listOf(dice4, dice6, dice8)

    listOfDice.forEach {
        println(it.getNumber())
        println()
    }
}

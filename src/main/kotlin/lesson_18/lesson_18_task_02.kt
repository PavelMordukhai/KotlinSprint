package org.example.lesson_18

import kotlin.random.Random
import kotlin.random.nextInt

abstract class Dice {
    abstract val numberOfSides: Int
    fun getNumber(): Int = Random.nextInt(1..numberOfSides)
    abstract fun printResult()
}

class FourSidedDice : Dice() {
    override val numberOfSides: Int = 4
    override fun printResult() {
        println("На четырёхгранной кости выпало число ${getNumber()}")
    }
}

class SixSidedDice : Dice() {
    override val numberOfSides: Int = 6
    override fun printResult() {
        println("На шестигранной кости выпало число ${getNumber()}")
    }
}

class EightSidedDice : Dice() {
    override val numberOfSides: Int = 8
    override fun printResult() {
        println("На восьмигранной кости выпало число ${getNumber()}")
    }
}

fun main() {
    val dice4 = FourSidedDice()
    val dice6 = SixSidedDice()
    val dice8 = EightSidedDice()

    val listOfDice: List<Dice> = listOf(dice4, dice6, dice8)

    listOfDice.forEach {
        it.printResult()
    }

    // Вывод без текста
    listOfDice.forEach {
        println(it.getNumber())
    }
}

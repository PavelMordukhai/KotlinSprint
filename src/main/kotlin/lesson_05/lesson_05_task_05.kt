package org.example.lesson_05

import kotlin.random.Random

fun main() {

    val winList: MutableList<String> = mutableListOf()
    var rand = 0

    for (i in 1..3) {
        rand = Random.nextInt(MIN_NUM, MAX_NUM + 1)
        winList.add(rand.toString())
    }

    println("\nУгадайте три числа от $MIN_NUM до $MAX_NUM")

    print("\nВведите три числа через пробел: ")
    val userList: List<String> = readln().split(" ")

    val numOfMatches = (userList.intersect(winList)).size

    val resultText = when (numOfMatches) {
        3 -> "\nПоздравляем! Вы угадали все числа и выиграли джекпот!"
        2 -> "\nВы угадали два числа и получаете крупный приз!"
        1 -> "\nВы угадали одно число и выиграли утешительный приз!"
        else -> "\nК сожалению, вы не угадали ни одно число"
    }

    println(resultText)
    print("\nВыигрышные числа - ")
    winList.forEach { print("$it ") }
}

const val MIN_NUM = 0
const val MAX_NUM = 42
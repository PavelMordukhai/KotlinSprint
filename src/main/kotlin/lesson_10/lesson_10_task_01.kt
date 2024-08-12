package org.example.lesson_10

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println("Сыграйте в кости с компьютером!")
    print("\nВаш ход! Для броска нажмите Enter: ")
    readln()

    val yourNumber = rollTheDice()
    println("У вас выпало число $yourNumber")

    Thread.sleep(500)
    println("\nХод компьютера!")

    val compNumber = rollTheDice()
    println("У компьютера выпало число $compNumber")

    Thread.sleep(500)
    val message = if (yourNumber > compNumber)
        "\nПобедило человечество!"
    else if (yourNumber < compNumber)
        "\nПобедила машина!"
    else "\nПока ничья!"
    println(message)
}


fun rollTheDice(): Int {
    var str = "."
    repeat(4) {
        print("\r$str")
        Thread.sleep(250)
        str += "."
    }
    println()
    return Random.nextInt(1..6)
}
package org.example.lesson_10

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var rounds = 0
    var win = 0
    var lose = 0
    var draw = 0

    val messages = arrayOf(
        "\nПобедило человечество!",
        "\nПобедила машина!",
        "\nПока ничья!"
    )

    println("Сыграйте в кости с компьютером!")

    while (true) {
        val messageIndex = playRound()
        println(messages[messageIndex])

        rounds++
        when (messageIndex) {
            0 -> win++
            1 -> lose++
            2 -> draw++
        }

        print("\nХотите бросить кости еще раз? Введите Да или Нет: ")
        val answer = readln().lowercase()
        if (answer == "да")
            continue
        else break
    }

    println("""
        
        |Всего было сыграно $rounds раундов.
        |Результаты:
        |- ничья - $draw;
        |- победа машины - $lose;
        |- победа человечества - $win.
        |В итоге: ${messages[getResult(win, lose)]}
    """.trimMargin())
}

// раунд
fun playRound(): Int {

    print("\nВаш ход! Для броска нажмите Enter: ")
    readln()

    val yourNumber = rollDice()
    println("У вас выпало число $yourNumber")

    Thread.sleep(500)
    println("\nХод компьютера!")

    val compNumber = rollDice()
    println("У компьютера выпало число $compNumber")

    Thread.sleep(500)
    val messageIndex = if (yourNumber > compNumber) 0
    else if (yourNumber < compNumber) 1
    else 2

    return messageIndex
}

// бросание кости
fun rollDice(): Int {
    var str = "."
    repeat(4) {
        print("\r$str")
        Thread.sleep(250)
        str += "."
    }
    println()
    return Random.nextInt(1..6)
}

// возврат результатов
fun getResult(win: Int, lose: Int): Int {
    return if (win > lose) 0
    else if (lose > win) 1
    else 2
}

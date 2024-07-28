package org.example.lesson_05

fun main() {

    val num1 = 5
    val num2 = 6
    val answer = num1 + num2
    var message = ""

    println("Докажите, что вы не бот. Сложите два числа: ")
    print("$num1 + $num2 = ")

    val userAnswer = readln().toInt()

    message = if (userAnswer == answer) "Добро пожаловать!" else "Доступ запрещен."
    println(message)
}
package org.example.lesson_05

fun main() {

    val winNum1 = 5
    val winNum2 = 6

    println("Угадайте два числа от 0 до 42")

    print("Введите первое число: ")
    val userNum1 = readln().toInt()

    print("Введите второе число: ")
    val userNum2 = readln().toInt()

    println("Правильные числа - $winNum1 и $winNum2")

    val resultText = if ((userNum1 == winNum1 && userNum2 == winNum2) || (userNum1 == winNum2 && userNum2 == winNum1))
        "Поздравляем! Вы выиграли главный приз!"
    else if ((userNum1 == winNum1 || userNum2 == winNum2) || (userNum1 == winNum2 || userNum2 == winNum1))
        "Вы выиграли утешительный приз!"
    else "Неудача!"

    println(resultText)
}


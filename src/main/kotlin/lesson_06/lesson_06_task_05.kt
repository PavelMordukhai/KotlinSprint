package org.example.lesson_06

import kotlin.random.Random

fun main() {
    println("Регистрация нового аккаунта\n")
    print("Придумайте логин: ")
    val newUserName = readln()
    print("Придумайте надёжный пароль: ")
    val newPassword = readln()
    println()

    var tries = TRIES
    println("Докажите, что вы не бот. Число попыток - ${tries}.\n")

    while (tries > 0) {
        val firstVal = Random.nextInt(MIN_NUM, MAX_NUM + 1)
        val secondVal = Random.nextInt(MIN_NUM, MAX_NUM + 1)

        print("$firstVal + $secondVal = ")
        val answer = readln().toInt()

        if (answer == firstVal + secondVal) {
            println("\nДобро пожаловать!")
            break

        } else if (--tries > 0) println("\nПопробуйте ещё раз")
    }

    if (tries == 0) {
        println("\nДоступ запрещен")
        return
    }

    var count = 0
    do {
        if (count++ > 0) println("\nНеверный ввод")

        print("\nВведите логин: ")
        val userName = readln()
        print("Введите пароль: ")
        val password = readln()
    } while ((userName != newUserName) || (password != newPassword))

    println("\nАвторизация прошла успешно")
}

const val MIN_NUM = 1
const val MAX_NUM = 9
const val TRIES = 3

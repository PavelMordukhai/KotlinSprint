package org.example.lesson_07

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    do {
        val yourAuthCode = Random.nextInt(1000..9999)
        println("\nВаш код авторизации: $yourAuthCode")

        print("\nВведите код авторизации: ")
        val authCode = readln().toInt()

    } while (authCode != yourAuthCode)

    println("\nДобро пожаловать!")
}
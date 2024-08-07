package org.example.lesson_06

fun main() {
    println("Регистрация нового аккаунта\n")
    print("Придумайте логин: ")
    val newUserName = readln()
    print("Придумайте надёжный пароль: ")
    val newPassword = readln()

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


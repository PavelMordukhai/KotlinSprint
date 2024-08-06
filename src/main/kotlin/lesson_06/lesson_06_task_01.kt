package org.example.lesson_06

fun main() {
    println("Регистрация нового аккаунта\n")
    print("Придумайте логин: ")
    val newUserName = readln()
    print("Придумайте надёжный пароль: ")
    val newPassword = readln()
    println()

    while (true) {
        print("Введите логин: ")
        val userName = readln()
        print("Введите пароль: ")
        val password = readln()

        if ((userName == newUserName) && (password == newPassword)) {
            println("Авторизация прошла успешно")
            break
        } else println("Неверный ввод\n")
    }
}


package org.example.lesson_10

fun main() {
    print("Придумайте логин: ")
    val userName = readln()

    print("Придумайте надёжный пароль: ")
    val password = readln()

    val message = if (checkDataLength(userName) && checkDataLength(password))
        "\nДобро пожаловать!"
    else "\nЛогин или пароль недостаточно длинные"
    println(message)
}

fun checkDataLength(data: String): Boolean = data.count() >= MIN_DATA_LENGTH

const val MIN_DATA_LENGTH = 4
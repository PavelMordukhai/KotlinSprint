package org.example.lesson_07

fun main() {

    val numbers = '0'..'9'
    val lowerCase = 'a'..'z'
    val upperCase = 'A'..'Z'

    val symbolTypesArr = arrayOf(numbers, lowerCase, upperCase)
    val symbols = symbolTypesArr.toMutableList()
    val symbolTypesCount = symbolTypesArr.size

    var password = ""
    var symbol = ""
    var passLength = 0

    do {
        print("\nВведите длину пароля (минимальная длина - $MIN_PASS_LENGTH символов): ")
        passLength = readln().toInt()

        if (passLength < MIN_PASS_LENGTH) println("\nНеверный ввод")
    } while (passLength < MIN_PASS_LENGTH)

    for (i in 1..(passLength - symbolTypesCount)) {
        val symbolType = symbolTypesArr.random()
        symbols.add(symbolType)
    }
    symbols.shuffle()

    for (i in symbols) {
        symbol = i.random().toString()
        password += symbol
    }

    println("\nВаш пароль: $password")
}

const val MIN_PASS_LENGTH = 6
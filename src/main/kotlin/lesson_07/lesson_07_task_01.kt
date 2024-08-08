package org.example.lesson_07

fun main() {
    val numbers = 0..9
    val lowerCase = 'a'..'z'
    var password = ""
    var symbol = ""

    for (i in 0..5) {
        symbol = if (i % 2 == 0)
            lowerCase.random().toString()
        else
            numbers.random().toString()

        password += symbol
    }

    println(password)
}
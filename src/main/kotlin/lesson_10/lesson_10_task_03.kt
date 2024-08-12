package org.example.lesson_10

fun main() {

    print("Введите длину пароля: ")
    val passLength = readln().toInt()
    val password = getPassword(passLength)
    println("Ваш пароль: $password")
}


fun getPassword(passLength: Int): String {
    val numbers = 0..9
    val specialChars = """!"#$%&'()*+,-./ """

    var password = ""

    for (i in 1..passLength) {
        val symbol = if (i % 2 == 0)
            specialChars.random().toString()
        else
            numbers.random().toString()
        password += symbol
    }
    return password
}
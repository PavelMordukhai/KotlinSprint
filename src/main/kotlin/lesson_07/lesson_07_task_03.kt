package org.example.lesson_07

fun main() {
    print("Введите число: ")
    val yourNum = readln().toInt()

    if (yourNum >= 0) {
        for (i in (0..yourNum step 2))
            println(i)
    } else {
        for (i in (0 downTo yourNum step 2))
            println(i)
    }
}
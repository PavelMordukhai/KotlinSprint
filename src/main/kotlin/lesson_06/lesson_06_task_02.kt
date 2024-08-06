package org.example.lesson_06

fun main() {
    print("Введите количество секунд, которые нужно засечь: ")
    val seconds = readln().toInt()
    var secondsLeft = seconds

    while (secondsLeft > 0) {
        secondsLeft--
        Thread.sleep(1000)
    }
    println("Прошло $seconds секунд")
}


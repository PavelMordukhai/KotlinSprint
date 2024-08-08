package org.example.lesson_07

fun main() {
    print("Введите количество секунд, которые нужно засечь: ")
    var seconds = readln().toInt()

    for (i in seconds downTo 1) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}


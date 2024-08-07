package org.example.lesson_06

fun main() {
    print("Введите количество секунд, которые нужно засечь: ")
    val seconds = readln().toLong()
    Thread.sleep(seconds * 1000)

    println("Прошло $seconds секунд")
}

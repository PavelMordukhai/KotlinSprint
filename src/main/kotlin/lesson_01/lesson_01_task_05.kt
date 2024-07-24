package org.example.lesson_01

fun main() {

    // количество секунд, которые Гагарин провел в космосе
    val seconds: Short = 6480

    val remainder = seconds % 3600

    val hour = seconds / 3600
    val minute = remainder / 60
    val second = remainder % 60

    println("0$hour:$minute:0$second")
}
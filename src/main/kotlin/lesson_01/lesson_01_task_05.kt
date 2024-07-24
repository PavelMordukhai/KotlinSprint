package org.example.lesson_01

fun main() {

    // количество секунд, которые Гагарин провел в космосе
    val seconds: Short = 6480

    val hour = seconds / 3600
    val minute = (seconds % 3600) / 60
    val second = seconds % 60

    // println("0$hour:$minute:0$second")
    println(String.format("%02d:%02d:%02d", hour, minute, second))
}
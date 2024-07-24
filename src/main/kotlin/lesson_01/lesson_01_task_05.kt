package org.example.lesson_01

fun main() {

    // количество секунд, которые Гагарин провел в космосе
    val seconds: Short = 6480

    val hour = seconds / SECONDS_IN_AN_HOUR
    val minute = (seconds % SECONDS_IN_AN_HOUR) / SECONDS_IN_AN_MINUTE
    val second = seconds % SECONDS_IN_AN_MINUTE

    // println("0$hour:$minute:0$second")
    println(String.format("%02d:%02d:%02d", hour, minute, second))
}

const val SECONDS_IN_AN_HOUR = 3600
const val SECONDS_IN_AN_MINUTE = 60
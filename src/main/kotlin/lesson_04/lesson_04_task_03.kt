package org.example.lesson_04

fun main() {

    // текущие условия
    val weatherToday = true
    val tent = true
    val airHumidity = 20
    val timeOfYear = "зима"

    println("Благоприятные ли условия сейчас для бобовых? " +
            "${(weatherToday == WEATHER_TODAY) && (tent == TENT) && 
                    (airHumidity == AIR_HUMIDITY) && (timeOfYear != TIME_OF_YEAR)}")
}

// Критерии благоприятных условий
const val WEATHER_TODAY = true
const val TENT = true
const val AIR_HUMIDITY = 20
const val TIME_OF_YEAR = "зима" // зима - неблагоприятное условие
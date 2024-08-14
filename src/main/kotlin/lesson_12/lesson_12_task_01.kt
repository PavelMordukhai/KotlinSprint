package org.example.lesson_12


class WeatherOfDay() {

    var daytimeTemp = 0
    var nightTemp = 0
    var isPrecipitation = false

    fun printWeatherData() {
        println(
            """
            Дневная температура: $daytimeTemp ${'\u2103'}
            Ночная температура: $nightTemp ${'\u2103'}
            Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}
        """.trimIndent()
        )
    }
}


fun main() {
    val firstDay = WeatherOfDay()
    val secondDay = WeatherOfDay()

    firstDay.daytimeTemp = 25
    firstDay.nightTemp = 15
    firstDay.isPrecipitation = true

    secondDay.daytimeTemp = -20
    secondDay.nightTemp = -30
    secondDay.isPrecipitation = false

    firstDay.printWeatherData()
    println()
    secondDay.printWeatherData()
}





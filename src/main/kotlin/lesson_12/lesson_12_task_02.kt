package org.example.lesson_12


class WeatherOfDay2(
    val daytimeTemp: Int,
    val nightTemp: Int,
    val isPrecipitation: Boolean,
) {

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
    val firstDay = WeatherOfDay2(-20, -30, true)
    val secondDay = WeatherOfDay2(25, 15, false)

    firstDay.printWeatherData()
    println()
    secondDay.printWeatherData()
}

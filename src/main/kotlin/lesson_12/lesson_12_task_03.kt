package org.example.lesson_12


class WeatherOfDay3(
    daytimeTempK: Int,
    nightTempK: Int,
    _isPrecipitation: Boolean,
) {

    val daytimeTempC = daytimeTempK - 273
    val nightTempC = nightTempK - 273
    val isPrecipitation = _isPrecipitation

    fun printWeatherData() {
        println(
            """
            Дневная температура: $daytimeTempC ${'\u2103'}
            Ночная температура: $nightTempC ${'\u2103'}
            Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}
        """.trimIndent()
        )
    }
}


fun main() {
    val firstDay = WeatherOfDay3(300, 290, true)
    val secondDay = WeatherOfDay3(250, 235, false)

    firstDay.printWeatherData()
    println()
    secondDay.printWeatherData()
}

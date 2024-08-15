package org.example.lesson_12


class WeatherOfDay4(
    val daytimeTemp: Int,
    val nightTemp: Int,
    val isPrecipitation: Boolean,
) {
    init {
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
    val firstDay = WeatherOfDay4(-5, -15, true)
    val secondDay = WeatherOfDay4(35, 20, false)
}

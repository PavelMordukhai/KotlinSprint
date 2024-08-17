package org.example.lesson_15


abstract class WeatherStationStats()


class Temperature(
    val temperature: Int
) : WeatherStationStats()


class PrecipitationAmount(
    val precipitationAmount: Int
) : WeatherStationStats()


class WeatherServer(val message: WeatherStationStats) {

    fun getType() {

        if (message is Temperature)
            println("Температура равна ${message.temperature} ${'\u2103'}")

        if (message is PrecipitationAmount)
            println("Количество осадков: ${message.precipitationAmount} мм")
    }
}


fun main() {

    val temperature1 = Temperature(20)
    val precipitationAmount1 = PrecipitationAmount(50)

    val messageToServer1 = WeatherServer(temperature1)
    val messageToServer2 = WeatherServer(precipitationAmount1)

    messageToServer1.getType()
    messageToServer2.getType()
}

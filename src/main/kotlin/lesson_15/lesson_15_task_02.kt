package org.example.lesson_15


abstract class WeatherStationStats()


class Temperature(
    val temperature: Int
) : WeatherStationStats()


class PrecipitationAmount(
    val precipitationAmount: Int
) : WeatherStationStats()


class WeatherServer {

    fun sendMessage(message: WeatherStationStats): String {

        val textData = when(message) {
            is Temperature -> "Температура равна ${message.temperature} ${'\u2103'}"
            is PrecipitationAmount -> "Количество осадков: ${message.precipitationAmount} мм"
            else -> "Прочие данные"
        }
        return textData
    }
}


fun main() {

    val object1 = Temperature(20)
    val object2 = PrecipitationAmount(50)

    val messageToServer1 = WeatherServer()
    val messageToServer2 = WeatherServer()

    val data1 = messageToServer1.sendMessage(object1)
    val data2 = messageToServer2.sendMessage(object2)

    println(data1)
    println(data2)
}

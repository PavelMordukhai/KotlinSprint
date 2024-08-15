package org.example.lesson_12

import kotlin.random.Random
import kotlin.random.nextInt

const val NUMBER_OF_DAYS = 30


class WeatherOfDay5(
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

    val weatherDataList = getWeatherDataList()

    val daytimeTempList: MutableList<Int> = mutableListOf()
    val nightTempList: MutableList<Int> = mutableListOf()

    val precipitationDays: MutableList<Int> = mutableListOf()

    for (item in weatherDataList) {

        daytimeTempList.add(item.daytimeTemp)
        nightTempList.add(item.nightTemp)

        if (item.isPrecipitation) {
            precipitationDays.add(weatherDataList.indexOf(item) + 1)
        }
    }

    val averageDaytimeTemp = daytimeTempList.average()
    val averageNightTemp = nightTempList.average()

    val countPrecipitationDays = precipitationDays.size

    println("Дневная температура по датам:")
    printTemperatureList(daytimeTempList)

    println("Ночная температура по датам:")
    printTemperatureList(nightTempList)

    println("Средняя дневная температура: ${String.format("%.1f", averageDaytimeTemp)} ${'\u2103'}")
    println("Средняя ночная температура: ${String.format("%.1f", averageNightTemp)} ${'\u2103'}")
    println()
    println("Даты дней с осадками: ${precipitationDays.joinToString()}")
    println("Количество дней с осадками: $countPrecipitationDays")
}


fun getWeatherDataList(): List<WeatherOfDay5> {
    val weatherDataList: MutableList<WeatherOfDay5> = mutableListOf()

    repeat(NUMBER_OF_DAYS) {
        val daytimeTemp = Random.nextInt(25..35)
        val nightTemp = Random.nextInt(15..25)
        val isPrecipitation = Random.nextBoolean()

        weatherDataList.add(
            WeatherOfDay5(
                daytimeTemp = daytimeTemp,
                nightTemp = nightTemp,
                isPrecipitation = isPrecipitation
            )
        )
    }

    return weatherDataList
}


fun printTemperatureList(tempList: MutableList<Int>) {
    for (i in 1 .. NUMBER_OF_DAYS) {
        print("$i: ${tempList[i - 1]}\t\t")
        if (i % 5 == 0) println()
    }
    println()
}

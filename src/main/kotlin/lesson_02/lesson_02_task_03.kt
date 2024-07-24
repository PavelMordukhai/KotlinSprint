package org.example.lesson_02

fun main() {

    /*
    Задача 3 к Уроку 2

    Сайт с расписанием поездов получает данные с сервера.
    Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
    Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

     – Создай целочисленные переменные и проинициализируй их этими данными;
     – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
     – Выведи результат в консоль.
     */

    val departureHour = 9 // час отбытия
    val departureMinute = 39 // минуты отбытия
    val travelTime = 457 // минут в пути

    val travelHour = travelTime / SECONDS_IN_A_MINUTE
    val travelMinute = travelTime % SECONDS_IN_A_MINUTE

    val arrivalHour = departureHour + travelHour + (departureMinute + travelMinute) / SECONDS_IN_A_MINUTE // час прибытия
    val arrivalMinute = (departureMinute + travelMinute) % SECONDS_IN_A_MINUTE // минуты прибытия

    println("Поезд прибудет в ${String.format("%02d:%02d", arrivalHour, arrivalMinute)}")
}

const val SECONDS_IN_A_MINUTE = 60
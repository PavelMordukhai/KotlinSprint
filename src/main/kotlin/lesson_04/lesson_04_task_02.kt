package org.example.lesson_04

/*
Задача 2 к Уроку 4

При работе на таможенном терминале важно точно определить категорию каждого груза.
Напиши программу, которая проверяет, соответствует ли груз категории "Average".
Эта категория имеет следующие параметры: вес от 35 кг(не включительно) до 100 кг (включительно),
и объём меньше 100 литров (не включительно).

Создай программу, которая отображает соответствие данных груза категории "Average".
Вывод программы может выглядеть так:
"Груз с весом 42 кг и объёмом 120 л соответствует категории 'Average': false".

- укажи предварительно заданные параметры категории;
- проверь, соответствую ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.
 */

fun main() {

    // Имя и характеристики категории груза
    val cargoCategory = "Average"
    val minAverageMass = 35 // не включительно
    val maxAverageMass = 100 // включительно
    val maxAverageVolume = 100 // не включительно

    // груз-1
    val cargoMass1 = 20
    val cargoVolume1 = 80

    // груз-2
    val cargoMass2 = 50
    val cargoVolume2 = 100

    println("Груз с весом $cargoMass1 кг и объёмом $cargoVolume1 л соответствует категории \'$cargoCategory\': " +
            "${(cargoMass1 > minAverageMass && cargoMass1 <= maxAverageMass) && cargoVolume1 < maxAverageVolume}")

    println("Груз с весом $cargoMass2 кг и объёмом $cargoVolume2 л соответствует категории \'$cargoCategory\': " +
            "${(cargoMass2 > minAverageMass && cargoMass2 <= maxAverageMass) && cargoVolume2 < maxAverageVolume}")
}
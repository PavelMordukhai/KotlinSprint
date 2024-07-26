package org.example.lesson_04

/*
Задача 5* к Уроку 4

Научно-исследовательский корабль может приступить к долгосрочному плаванию
при выполнении следующих условий:

- корабль не имеет повреждений;
- число экипажа составляет от 55 (включительно) до 70 человек (включительно);
- на борту есть более 50 ящиков провизии (не включительно);
- погода благоприятна или неблагоприятна.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:

- на борту рекомендованный состав экипажа 70 человек;
- погода благоприятная;
- на борту есть 50 и более ящиков провизии.

В качестве входных данных используй информацию, введённую через консоль:

- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Напиши программу, которая будет определять, может ли корабль отправиться в плавание.
Программа должна анализировать эти данный и выводить результат в консоль.
Для анализа должно использоваться единое составное условие,
состоящее только из логических операторов.
 */

fun main() {

    var shipDamage = false // корабль не имеет повреждений
    val minCrew = 55 // минимальный экипаж (включительно)
    val maxCrew = 70 // максимальный экипаж (включительно)
    val minProvisionBoxes = 50 // минимум ящиков провизии (не включительно)
    var weather = true // благоприятная погода

    shipDamage = readln().toBoolean() // есть ли повреждения?
    val crew = readln().toInt() // состав экипажа
    val provisionBoxes = readln().toInt() // количество ящиков с провизией
    weather = readln().toBoolean() // благоприятная ли погода?

    println("Может ли корабль отправиться в плавание? " +
            "${(!shipDamage && (crew in minCrew..maxCrew) && (provisionBoxes > minProvisionBoxes) && weather) ||
                    ((crew == maxCrew) && weather && (provisionBoxes >= minProvisionBoxes))}")
}
package org.example.lesson_02

fun main() {
    /*
    Задача 1 к Уроку 2

    Задача на среднее арифметическое.
    В классе с углубленным изучением английского языка учится 4 человека.
    У них следующие баллы по профильному предмету 3, 4, 3, 5.
    Пишем часть школьного софта, который посчитает средний балл по английскому для этого класса.

    – Написать выражение, которое высчитывает средний балл;
    – Распечатать результат в консоль;
    – В консоли должно быть выведено дробное число с 2 знаками после запятой.
     */

    val averageScore = (3 + 4 + 3 + 5) / 4.0

    println(String.format("%.2f", averageScore))
}
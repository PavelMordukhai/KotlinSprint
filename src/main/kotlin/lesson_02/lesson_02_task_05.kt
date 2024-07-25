package org.example.lesson_02

import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    /*

    Задача 5* к Уроку 2

    Напиши программу-калькулятор для банковского приложения (такой функционал бывает на промо экранах).
    Используя формулу сложных процентов (ее можно загуглить),
    нужно посчитать размер вклада через 20 лет с такими условиями:

     – Клиент ввел в приложении сумму 70_000 рублей (считать ее известной заранее и проинициализировать переменную);
     – Процентная ставка 16,7% (проценты начисляются в конце года);
     – Подсчитать размер вклада через 20 лет;
     – Результат должен быть дробным числом с 3 знаками после запятой;
     – Ответ должен получиться таким 1536438.428.
     */

    val depositAmount = 70000 // сумма вклада
    val interestRate = 16.7 // процентная ставка
    val depositTerm = 20 // срок вклада в годах

    // Будущий размер вклада
    val depositAmountInAFewYears = depositAmount * (1 + interestRate / 100).pow(depositTerm)

    // println(String.format("%.3f", depositAmountInAFewYears)) // вывод с запятой
    println((depositAmountInAFewYears * 1000).roundToInt() / 1000.0) // вывод с точкой
}
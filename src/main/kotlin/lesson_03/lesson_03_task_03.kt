package org.example.lesson_03

/*
Задача 3 к Уроку 3

Пишем программу, которая будет помогать учить таблицу умножения.
В отдельную переменную будет записываться число (объявить и проинициализировать),
а выводиться будет таблица умножения для этого числа.
Таблица должна корректно печататься, если в исходную переменную подставлять разные числа.

Пример вывода:
6 x 1 = 6
6 x 2 = 12
…
6 x 9 = 54

 – Вместо числа 6 использовать данные из объявленной переменной;
 – Вычислять значения прямо в строке;
 – Вывод всей таблицы нужно сделать в одной функции println(), которая вызывается один раз.
 */

fun main() {

    print("Введите целое число: ")
    val enteredInteger = readln().toInt()

    println("""
        $enteredInteger x 1 = $enteredInteger
        $enteredInteger x 2 = ${enteredInteger * 2}
        $enteredInteger x 3 = ${enteredInteger * 3}
        $enteredInteger x 4 = ${enteredInteger * 4}
        $enteredInteger x 5 = ${enteredInteger * 5}
        $enteredInteger x 6 = ${enteredInteger * 6}
        $enteredInteger x 7 = ${enteredInteger * 7}
        $enteredInteger x 8 = ${enteredInteger * 8}
        $enteredInteger x 9 = ${enteredInteger * 9}
    """.trimIndent())

    /*
    // Не по теме урока, но всё же
    for (i in 1..9)
        println("$enteredInteger x $i = ${enteredInteger * i}")
     */
}
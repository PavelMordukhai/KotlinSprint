package org.example.lesson_03

/*
Задача 1 к Уроку 3

При входе в приложение высвечивается приветствие.
Представим, что мы пишем функцию, которая будет выводить приветствие с именем пользователя на экран
(в нашем случае в консоль). Текст приветствия может меняться в зависимости от времени суток.
Так, например, выводится приветствие при входе в приложение Сбербанка.

Приветствие и имя пользователя должны храниться в отдельных переменных.
Вывести в консоль два приветствия (для дня и для вечера), перезаписывая данные в одну исходную переменную.
 */

fun main() {
    /*
    val greeting1 = "Добрый"
    val username1 = "Юзер"

    println("$greeting1 день, $username1!")
    println("$greeting1 вечер, $username1!")
     */

    // Вариант, если перезаписывать данные в исходную переменную greeting:

    var greeting: String
    val username = "Юзер"

    greeting = "Добрый день"
    println("$greeting, $username!")

    greeting = "Добрый вечер"
    println("$greeting, $username!")
}
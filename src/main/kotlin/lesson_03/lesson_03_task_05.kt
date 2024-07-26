package org.example.lesson_03

/*
Задача 5* к Уроку 3

Продолжаем работать над приложением “Шахматы”.
Напиши программу для сервера, которая примет строку, отправленную игроком
(считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”).

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих:
откуда, куда и номер хода, присвоить соответствующим переменным и распечатать по отдельности.
 */

fun main() {

    val chessMove = "D2-D4;0" // ход игрока

    val startSpace: String // откуда ходит фигура
    val endSpace: String // куда ходит фигура
    val moveNumber: String // номер хода

    val values = chessMove.split("-", ";")

    startSpace = values[0]
    endSpace = values[1]
    moveNumber = values[2]

    println(startSpace)
    println(endSpace)
    println(moveNumber)
}
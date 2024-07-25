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

    var startSpace: String // откуда ходит фигура
    var endSpace: String // куда ходит фигура
    var moveNumber: String // номер хода

    startSpace = chessMove[0].toString() + chessMove[1].toString()
    endSpace = chessMove[3].toString() + chessMove[4].toString()
    moveNumber = chessMove[6].toString()

    println(startSpace)
    println(endSpace)
    println(moveNumber)
}
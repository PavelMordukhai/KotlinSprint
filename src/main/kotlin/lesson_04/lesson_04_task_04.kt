package org.example.lesson_04

/*
Задача 4 к Уроку 4

Программа тренировок разбивает упражнения на две группы: упражнения для мышц рук/пресса и ног/спины.
Она рекомендует делать упражнения на каждую группу мышц через день.
Пользователь начал занятия с рук и пресса.
Напишите программу, которая будет сообщать, какие упражнения нужно выполнить сегодня.

Предположим, что сегодня 5 день тренировок. В первый день выполнялись упражнения для рук и пресса.
Выведи сообщение в виде нескольких красивых ровных строк.

Вывод должен быть таким:

Упражнения для рук:    true
Упражнения для ног:    false
Упражнения для спины:  false
Упражнения для пресса: true

- всё сообщение должно печататься в одном println();
- при изменении значения переменной дня тренировки на 1 день вперёд вывод должен меняться.
 */

fun main() {

    val group1 = "руки и пресс" // первая группа упражнений
    val group2 = "ноги и спина" // вторая группа упражнений

    // вводится пользователем
    val firstDay = group1 // группа упражнений в первый день
    val dayOfTraining = 5 // номер дня с первого дня упражнений

    val firstGroup = (firstDay == group1)
    val oddDay = (dayOfTraining % 2 == 1)

    println("""
        Упражнения для рук:    ${(firstGroup && oddDay) || (!firstGroup && !oddDay)} 
        Упражнения для ног:    ${(firstGroup && !oddDay) || (!firstGroup && oddDay)} 
        Упражнения для спины:  ${(firstGroup && !oddDay) || (!firstGroup && oddDay)} 
        Упражнения для пресса: ${(firstGroup && oddDay) || (!firstGroup && !oddDay)} 
    """.trimIndent())
}
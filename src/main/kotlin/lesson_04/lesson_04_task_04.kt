package org.example.lesson_04

fun main() {

    val group1 = "руки и пресс"
    val group2 = "ноги и спина"

    // вводится пользователем
    val firstDay = group1 // группа упражнений в первый день
    val dayOfTraining = 5 // номер дня с первого дня упражнений

    val oddDay = (dayOfTraining % 2 == 1)
    val group = ((firstDay == group1) && oddDay) || ((firstDay == group2) && !oddDay)

    println("""
        Упражнения для рук:    $group 
        Упражнения для ног:    ${!group}
        Упражнения для спины:  ${!group}
        Упражнения для пресса: $group 
    """.trimIndent())
}
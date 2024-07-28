package org.example.lesson_05

fun main() {

    val userYearBirth = readln().toInt()

    val thisYear = 2024
    val userAge = thisYear - userYearBirth

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    // else if (AGE_FOR_RESTRICTED_CONTENT.contains(userAge)) "Показать экран с ограниченным контентом"
    else if (userAge in AGE_FOR_RESTRICTED_CONTENT) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"
    println(resultText)
}

val AGE_FOR_RESTRICTED_CONTENT = setOf(16, 17)
const val AGE_OF_MAJORITY = 18
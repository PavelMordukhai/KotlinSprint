package org.example.lesson_05

fun main() {

    val userYearBirth = readln().toInt()

    val thisYear = 2024
    val userAge = thisYear - userYearBirth

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (userAge == AGE_FOR_RESTRICTED_CONTENT_16 || userAge == AGE_FOR_RESTRICTED_CONTENT_17)
        "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"
    println(resultText)
}

const val AGE_FOR_RESTRICTED_CONTENT_16 = 16
const val AGE_FOR_RESTRICTED_CONTENT_17 = 17
const val AGE_OF_MAJORITY = 18
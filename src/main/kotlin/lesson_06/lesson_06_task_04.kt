package org.example.lesson_06

import kotlin.random.Random

fun main() {
    val winNumber = Random.nextInt(MIN_NUMBER, MAX_NUMBER + 1)
    var tries = NUMBER_OF_TRIES

    println(
        """
        Компьютер загадал случайное число от $MIN_NUMBER до $MAX_NUMBER. 
        Сможете отгадать? Количество попыток - $tries.
        
    """.trimIndent()
    )

    while (tries > 0) {
        print("Попытка № ${-((--tries) - 5)}. Введите число: ")
        val number = readln().toInt()

        if (number == winNumber) {
            println("\nЭто была великолепная игра!")
            return
        } else {
            println(
                """
                Неверно.
                Осталось попыток - $tries
                
            """.trimIndent()
            )
        }
    }
    println(
        """
        У вас не осталось попыток.
        Было загадано число $winNumber
    """.trimIndent()
    )
}

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9
const val NUMBER_OF_TRIES = 5
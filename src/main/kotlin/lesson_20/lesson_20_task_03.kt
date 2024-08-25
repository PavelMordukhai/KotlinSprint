package org.example.lesson_20

class Player1 {
    var isKey = false
        private set
}

fun main() {
    val player = Player1()
    val checkForKey: (Player1) -> Boolean = { it.isKey }

    if (checkForKey(player))
        println("Вы открыли дверь")
    else
        println("Дверь заперта")
}

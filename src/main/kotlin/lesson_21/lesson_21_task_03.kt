package org.example.lesson_21

class Player(
    private val name: String,
    var currentHealth: Int,
) {
    val maxHealth = 100
}

fun Player.isHealthy() = currentHealth == maxHealth

fun main() {
    val player1 = Player("qwerty1", 50)
    val player2 = Player("qwerty2", 100)

    println(player1.isHealthy())
    println(player2.isHealthy())
}

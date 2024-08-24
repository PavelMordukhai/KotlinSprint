package org.example.lesson_20

class Player(
    private val name: String,
    var currentHealth: Int,
) {
    val maxHealth = 100
}

fun main() {
    val player = Player("qwerty", 50)
    val healingPotion: (Player) -> Unit = {
        if (it.currentHealth < it.maxHealth)
            it.currentHealth = it.maxHealth
    }
    healingPotion(player)
    println(player.currentHealth)
}

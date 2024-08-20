package org.example.lesson_16


class Player(
    val name: String,
    private var health: Int,
    private var attackPower: Int,
) {
    fun damageThePlayer(damage: Int) {
        if ((health > 0) && (damage < health)) {
            health -= damage
            println("Нанесён урон - $damage")
            getInfoAboutHealth()
        } else if ((health > 0) && (damage >= health)) {
            println("Нанесён урон - $health") // невозможно нанести урон больше, чем осталось здоровья
            health = 0 // поэтому здоровье не уходит в минус
            getInfoAboutHealth()
            killThePlayer()
        } else {
            getInfoAboutHealth()
            println("Нанести урон невозможно")
            killThePlayer()
        }
    }

    fun treatThePlayer(treatment: Int) {
        if (health > 0) {
            health += treatment
            println("Лечение +$treatment")
            getInfoAboutHealth()
        } else {
            getInfoAboutHealth()
            println("Лечение невозможно")
            killThePlayer()
        }
    }

    private fun killThePlayer() {
        println("You died")
        attackPower = 0
        health = 0
    }

    private fun getInfoAboutHealth() {
        if (health < 0)
            health = 0
        println("Текущее здоровье - $health")
    }
}


fun main() {

    val player1 = Player("qwe", 100, 20)

    player1.damageThePlayer(30)
    println()

    player1.treatThePlayer(10)
    println()

    player1.damageThePlayer(40)
    println()

    player1.damageThePlayer(30)
    println()

    player1.treatThePlayer(10)
    println()

    player1.damageThePlayer(30)
    println()

    player1.treatThePlayer(10)
    println()

    player1.damageThePlayer(30)
}

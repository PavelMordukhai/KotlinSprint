package org.example.lesson_16


class Player(
    val name: String,
    private var health: Int,
    var attackPower: Int,
) {
    fun damageThePlayer(damage: Int) {
        health -= damage
        if (health <= 0)
            killThePlayer()
    }

    fun treatThePlayer(treatment: Int) {
        if (health > 0)
            health += treatment
        else
            killThePlayer()
    }

    private fun killThePlayer() {
        println("You died")
        attackPower = 0
        health = 0
    }

    fun getHealth() = health
}


fun main() {

    val player1 = Player("qwe", 100, 20)

    player1.damageThePlayer(30)
    println(player1.getHealth())

    player1.treatThePlayer(10)
    println(player1.getHealth())

    player1.damageThePlayer(40)
    println(player1.getHealth())

    player1.damageThePlayer(30)
    println(player1.getHealth())

    player1.treatThePlayer(10)
    println(player1.getHealth())

    player1.damageThePlayer(30)
    println(player1.getHealth())

    player1.treatThePlayer(10)
    println(player1.getHealth())
}



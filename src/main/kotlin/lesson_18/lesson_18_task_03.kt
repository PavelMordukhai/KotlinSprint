package org.example.lesson_18

open class Tamagotchi(val name: String = "Tamagotchi") {

    open fun printEating() {
        println("$name -> is eating")
    }

    open fun printSleeping() {
        println("$name -> is sleeping")
    }
}

class Fox(name: String) : Tamagotchi(name) {
    override fun printEating() {
        println("$name -> is eating berries")
    }
}

class Dog(name: String) : Tamagotchi(name) {
    override fun printEating() {
        println("$name -> is eating bones")
    }
}

class Cat(name: String) : Tamagotchi(name) {
    override fun printEating() {
        println("$name -> is eating fish")
    }
}

fun main() {
    val fox = Fox("Alice")
    val dog = Dog("Toto")
    val cat = Cat("Behemoth")

    val listOfDice: List<Tamagotchi> = listOf(fox, dog, cat)

    listOfDice.forEach {
        it.printEating()
    }
}

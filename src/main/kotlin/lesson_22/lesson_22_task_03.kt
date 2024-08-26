package org.example.lesson_22

data class Cat(
    val name: String,
    val isWhiskers: Boolean,
    val numberOfPaws: Byte,
    val isTail: Boolean,
)

fun main() {
    val cat = Cat("Matroskin", true, 4, true)
    val (name, isWhiskers, numberOfPaws, isTail) = cat
    println(name)
    println(isWhiskers)
    println(numberOfPaws)
    println(isTail)
}

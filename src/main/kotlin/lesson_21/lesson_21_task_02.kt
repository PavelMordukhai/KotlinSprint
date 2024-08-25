package org.example.lesson_21

fun main() {
    val listOfNumbers = listOf(5, 9, 6, 4, 7)
    println(listOfNumbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    for (element in this) {
        if (element % 2 == 0)
            sum += element
    }
    return sum
}

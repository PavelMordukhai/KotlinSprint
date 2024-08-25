package org.example.lesson_21

fun main() {
    val text = "HELLO Michigan"
    val numberOfVowels = text.vowelCount()
    println(numberOfVowels)
}

fun String.vowelCount(): Int {
    val vowels = "aeiouy"
    var count = 0
    for (i in this) {
        if (i.lowercase() in vowels)
            count++
    }
    return count
}

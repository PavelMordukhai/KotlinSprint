package org.example.lesson_21

import java.io.File

fun File.writeToFileBeginning(word: String) {
    var temp = ""
    if (exists())
        temp = readLines().joinToString("\n")
    writeText("${word.lowercase()}\n")
    appendText(temp)
}

fun main() {
    val file = File("english.txt")
    file.writeToFileBeginning("Cat")
    file.writeToFileBeginning("Dog")
    file.writeToFileBeginning("Fox")
}

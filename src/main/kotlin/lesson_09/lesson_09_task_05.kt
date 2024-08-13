package org.example.lesson_09

import java.util.*

fun main() {

    val ingredientsSet: MutableSet<String> = mutableSetOf()

    println("""
        Введите $NUMBER_OF_INGREDIENTS названий ингредиентов (каждый с новой строки).
        Повторы будут игнорироваться не зависимо от регистра:
    """.trimIndent())

    do {
        print("- ")
        val ingredient = readln().lowercase()
        ingredientsSet.add(ingredient)
    } while (ingredientsSet.size < NUMBER_OF_INGREDIENTS)

    val ingredientsString = ingredientsSet.sorted().joinToString()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    println(ingredientsString)
}

const val NUMBER_OF_INGREDIENTS = 5
package org.example.lesson_09

import java.util.*

fun main() {

    val ingredientsList: MutableList<String> = mutableListOf()

    println("Введите $NUMBER_OF_INGREDIENTS названий ингредиентов")

    var item = 1
    do {
        print("Ингредиент №${item}: ")
        val ingredient = readln()
        if (ingredient in ingredientsList) {
            println("Повтор. Повторите ввод")
            continue
        }
        item++
        ingredientsList.add(ingredient)
    } while (item <= NUMBER_OF_INGREDIENTS)

    val ingredientsString = ingredientsList.map { it.lowercase() }.sorted().joinToString()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    println(ingredientsString)
}

const val NUMBER_OF_INGREDIENTS = 5
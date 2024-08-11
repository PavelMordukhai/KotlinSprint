package org.example.lesson_09

fun main() {

    val ingredientsList = mutableListOf("яйца", "соль", "растительное масло")

    println("В рецепте есть базовые ингредиенты: ")
    ingredientsList.forEach { ingredient: String ->
        println("- $ingredient")
    }

    print("\nЖелаете добавить еще? (да / нет) ")
    val answer = readln()

    if (answer.equals("да", ignoreCase = true)) {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient = readln()
        ingredientsList.add(newIngredient)
    } else return

    println("\nТеперь в рецепте есть следующие ингредиенты: ")
    ingredientsList.forEach {
        println("- $it")
    }
}
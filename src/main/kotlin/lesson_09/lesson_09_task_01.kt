package org.example.lesson_09

fun main() {

    val ingredientsList = listOf(
        "картофель", "репчатый лук", "растительное масло",
        "сливочное масло", "соль", "чёрный молотый перец"
    )

    println("В рецепте есть следующие ингредиенты: ")
    ingredientsList.forEach {
        println("- $it")
    }
}
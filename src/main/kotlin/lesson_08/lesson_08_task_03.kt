package org.example.lesson_08

fun main() {

    val ingredientsArr = arrayOf(
        "картофель", "репчатый лук", "растительное масло", "сливочное масло", "соль", "чёрный молотый перец"
    )

    print("Введите название ингредиента: ")
    val ingredient = readln()

    if (ingredient in ingredientsArr)
        println("Ингредиент \"$ingredient\" в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")
}
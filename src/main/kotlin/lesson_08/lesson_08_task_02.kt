package org.example.lesson_08

fun main() {

    val ingredientsArr = arrayOf(
        "картофель", "репчатый лук", "растительное масло", "сливочное масло", "соль", "чёрный молотый перец"
    )

    print("Введите название ингредиента: ")
    val ingredient = readln()

    for (i in ingredientsArr) {
        if (i == ingredient) {
            println("Ингредиент \"$i\" в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}
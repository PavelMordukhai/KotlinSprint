package org.example.lesson_08

fun main() {

    print("Введите количество ингредиентов: ")
    val numberOfIngredients = readln().toInt()

    val ingredientsArr = Array(numberOfIngredients) { "" }

    println()
    for (i in 0..< numberOfIngredients) {
        print("Введите ингредиент № ${i + 1}: ")
        ingredientsArr[i] = readln()
    }

    println()
    println(ingredientsArr.joinToString())
}

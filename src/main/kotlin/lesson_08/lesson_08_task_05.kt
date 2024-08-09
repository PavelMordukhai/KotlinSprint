package org.example.lesson_08

fun main() {

    print("Введите количество ингредиентов: ")
    val numberOfIngredients = readln().toInt()

    val ingredientsArr = Array(numberOfIngredients) { "" }

    println()
    for (i in 1..numberOfIngredients) {
        print("Введите ингредиент №$i: ")
        ingredientsArr[i - 1] = readln()
    }

    println()
    println(ingredientsArr.joinToString())
}

package org.example.lesson_09

fun main() {
    print("Введите пять ингредиентов (через запятую с пробелом): ")
    val ingredientsList = readln().split(", ").toMutableList()

    ingredientsList.sort()
    println(ingredientsList.joinToString())
}
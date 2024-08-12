package org.example.lesson_08

fun main() {

    val ingredientsArr = arrayOf(
        "картофель", "репчатый лук", "растительное масло", "сливочное масло", "соль", "чёрный молотый перец"
    )

    var oldIngredient = ""
    var oldIngredientIndex = -1

    println("Список ингредиентов: ")
    for (i in ingredientsArr) println("- $i")

    print("\nНапишите, какой ингредиент вы хотите заменить: ")
    do {
        oldIngredient = readln()
        oldIngredientIndex = ingredientsArr.indexOf(oldIngredient)
        if (oldIngredientIndex == -1) {
            print("\nТакого ингредиента в рецепте нет. Повторите ввод: ")
            continue
        }
    } while (oldIngredientIndex == -1)

    print("\nНапишите новый ингредиент, на который происходит замена: ")
    val newIngredient = readln()

    ingredientsArr[oldIngredientIndex] = newIngredient

    println("\nГотово! Вы сохранили следующий список: ")
    for (i in ingredientsArr) println("- $i")
}
package org.example.lesson_08

fun main() {

    val ingredientsArr = arrayOf(
        "картофель", "репчатый лук", "растительное масло", "сливочное масло", "соль", "чёрный молотый перец"
    )
    var oldIngredient = ""

    println("Список ингредиентов: ")
    for (i in ingredientsArr) println("- $i")

    print("\nНапишите, какой ингредиент вы хотите заменить: ")
    do {
        oldIngredient = readln()
        if (oldIngredient in ingredientsArr)
            break
        else {
            print("\nТакого ингредиента в рецепте нет. Повторите ввод: ")
            continue
        }
    } while (true)

    print("\nНапишите новый ингредиент, на который происходит замена: ")
    val newIngredient = readln()

    ingredientsArr[ingredientsArr.indexOf(oldIngredient)] = newIngredient

    println("\nГотово! Вы сохранили следующий список: ")
    for (i in ingredientsArr) println("- $i")
}
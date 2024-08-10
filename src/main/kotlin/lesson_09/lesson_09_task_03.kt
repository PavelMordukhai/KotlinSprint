package org.example.lesson_09

fun main() {

    val amountOfIngredient = listOf(2, 50, 15)

    print("Введите количество порций омлета: ")
    val numberOfServings = readln().toInt()

    val amountForAFewServings = amountOfIngredient.map {
        it * numberOfServings
    }

    val portion = when(numberOfServings) {
        1 -> "порцию"
        2, 3, 4 -> "порции"
        else -> "порций"
    }

    println("На $numberOfServings $portion вам понадобится: яиц – ${amountForAFewServings[0]} шт., " +
            "молока – ${amountForAFewServings[1]} мл, сливочного масла – ${amountForAFewServings[2]} гр.")
}
package org.example.lesson_16

import kotlin.math.pow

private const val PI = 3.14

class Circle(
    private val radius: Double
) {
    fun getCircumference() = 2 * PI * radius
    fun getArea() = PI * radius.pow(2)
}


fun main() {
    val circle1 = Circle(5.7)

    val circumference1 = circle1.getCircumference()
    val area1 = circle1.getArea()

    println("Длина окружности равна ${String.format("%.2f", circumference1)}")
    println("Площадь круга равна ${String.format("%.2f", area1)}")
}

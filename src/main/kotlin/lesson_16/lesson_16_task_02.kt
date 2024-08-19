package org.example.lesson_16


class Circle(
    private val radius: Double
) {
    private val pi = 3.14

    fun getCircumference() = 2 * pi * radius
    fun getArea() = pi * radius * radius
}


fun main() {
    val circle1 = Circle(5.7)

    val circumference1 = circle1.getCircumference()
    val area1 = circle1.getArea()

    println("Длина окружности равна ${String.format("%.2f", circumference1)}")
    println("Площадь круга равна ${String.format("%.2f", area1)}")
}

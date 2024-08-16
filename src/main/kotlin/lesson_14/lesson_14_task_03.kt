package org.example.lesson_14


const val PI = 3.14


abstract class Figure(val color: String) {

    abstract fun area(): Double
    abstract fun perimeter(): Double
}


class Circle(
    val radius: Double = 1.0,
    color: String = "white",
) : Figure(color) {

    override fun area(): Double {
        return (PI * radius * radius)
    }

    override fun perimeter(): Double {
        return (2 * PI * radius)
    }
}


class Rectangle(
    val width: Double = 1.0,
    val height: Double = 1.0,
    color: String = "white",
) : Figure(color) {

    override fun area(): Double {
        return (width * height)
    }

    override fun perimeter(): Double {
        return (2 * (width + height))
    }
}


fun main() {

    val listOfFigures: List<Figure> = listOf(
        Circle(5.0),
        Circle(3.5, "black"),
        Circle(),
        Circle(color = "black"),
        Rectangle(),
        Rectangle(3.5),
        Rectangle(2.5, 6.0, "black"),
        Rectangle(5.0, 7.0, "black"),
        Rectangle(2.0, 8.5),
        Rectangle(3.5, 6.5)
    )

    var blackPerimeter = 0.0
    var whiteArea = 0.0

    for (figure in listOfFigures) {

        if (figure.color == "black")
            blackPerimeter += figure.perimeter()
        else if (figure.color == "white")
            whiteArea += figure.area()
    }

    println("Сумма периметров всех черных фигур: ${String.format("%.2f", blackPerimeter)}")
    println("Сумма площадей всех белых фигур: ${String.format("%.2f", whiteArea)}")
}

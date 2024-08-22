package org.example.lesson_18

import kotlin.math.pow

open class Box {
    open fun getSurfaceArea() = 0.0
}

class ParallelepipedBox(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Box() {
    override fun getSurfaceArea(): Double {
        return (2 * (length * width + length * height + width * height))
    }
}

class CubeBox(private val size: Double) : Box() {
    override fun getSurfaceArea(): Double {
        return (6 * size.pow(2))
    }
}

fun main() {
    val box1 = ParallelepipedBox(20.0, 30.0, 40.0)
    val box2 = CubeBox(25.0)

    println("Площадь-1 равна ${box1.getSurfaceArea()}")
    println("Площадь-2 равна ${box2.getSurfaceArea()}")
}

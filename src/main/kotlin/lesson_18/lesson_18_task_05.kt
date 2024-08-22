package org.example.lesson_18

abstract class ObjectToDraw

class Point : ObjectToDraw()
class Square : ObjectToDraw()
class Circle : ObjectToDraw()

class Screen {
    fun draw(coordinateX: Int, coordinateY: Int, objectToDraw: ObjectToDraw) = "объект нарисован"
    fun draw(coordinateX: Float, coordinateY: Int, objectToDraw: ObjectToDraw) = "объект нарисован"
    fun draw(coordinateX: Int, coordinateY: Float, objectToDraw: ObjectToDraw) = "объект нарисован"
    fun draw(coordinateX: Float, coordinateY: Float, objectToDraw: ObjectToDraw) = "объект нарисован"
}

fun main() {
    // тест

    val object1 = Point()
    val object2 = Square()
    val object3 = Circle()

    println(Screen().draw(5, 6, object1))
    println(Screen().draw(5f, 6, object2))
    println(Screen().draw(5, 6.5f, object3))
    println(Screen().draw(5f, 6.5f, object1))
}

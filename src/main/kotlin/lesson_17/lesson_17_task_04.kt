package org.example.lesson_17

class Package(
    val number: Int,
    location: String,
) {
    private var moveCount = 0

    init {
        println("Текущее местонахождение посылки № $number: пункт обработки $location")
    }

    var location = location
        set(value) {
            println("Перемещение ${++moveCount} - $value")
            field = value
        }
}

fun main() {
    val package1 = Package(1, "location-1")

    package1.location = "location-1-1"
    package1.location = "location-1-2"
    package1.location = "location-1-3"
    package1.location = "location-2"

    println("Посылка № ${package1.number} прибыла в пункт обработки ${package1.location}")
}

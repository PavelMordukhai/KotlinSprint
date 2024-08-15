package org.example.lesson_14


open class Liner(
    val name: String,
    val speed: Int = 30,
    val cargoCapacity: Int = 10000,
    val passengerCapacity: Int = 1500,
)


class CargoShip(
    name: String,
) : Liner(name, speed = 20, cargoCapacity = 60000, passengerCapacity = 50)


class Icebreaker(
    name: String,
) : Liner(name, speed = 15, cargoCapacity = 5000, passengerCapacity = 30) {

    fun breakIce() {
        println("Ледокол ломает лёд")
    }
}


fun main() {
    val liner1 = Liner("Liner1")
    val cargoShip1 = CargoShip("CargoShip1")
    val icebreaker1 = Icebreaker("Icebreaker1")
}

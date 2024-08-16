package org.example.lesson_14


open class Liner(
    val name: String,
    val speed: Int = 30,
    val cargoCapacity: Int = 10000,
    val passengerCapacity: Int = 1500,
)


class CargoShip(
    name: String,
    speed: Int = 20,
    cargoCapacity: Int = 60000,
    passengerCapacity: Int = 50,
) : Liner(name, speed, cargoCapacity, passengerCapacity)


class Icebreaker(
    name: String,
    speed: Int = 15,
    cargoCapacity: Int = 5000,
    passengerCapacity: Int = 30,
) : Liner(name, speed, cargoCapacity, passengerCapacity) {

    fun breakIce() {
        println("Ледокол ломает лёд")
    }
}


fun main() {
    val liner1 = Liner("Liner1")
    val cargoShip1 = CargoShip("CargoShip1")
    val icebreaker1 = Icebreaker("Icebreaker1")
}

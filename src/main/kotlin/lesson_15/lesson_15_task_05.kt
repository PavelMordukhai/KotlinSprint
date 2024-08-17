package org.example.lesson_15


interface Movement {
    fun moveTo()
    fun moveBack()
}


interface PassengerTransportation {
    fun loadPassenger()
    fun unloadPassenger()
}


interface CargoTransportation {
    fun loadCargo()
    fun unloadCargo()
}


class Car(
    val name: String,
    var numberOfPassengers: Int
) : Movement, PassengerTransportation {

    override fun moveTo() {
        println("Легковой автомобиль $name уехал")
    }

    override fun moveBack() {
        println("Легковой автомобиль $name вернулся пустой")
    }

    override fun loadPassenger() {
        println("Легковой автомобиль $name загрузил пассажиров ($numberOfPassengers чел.)")
    }

    override fun unloadPassenger() {
        println("Легковой автомобиль $name выгрузил пассажиров ($numberOfPassengers чел.)")
    }
}


class Truck(
    val name: String,
    var numberOfTons: Int,


) : Movement, PassengerTransportation, CargoTransportation {

    val numberOfPassengers: Int = 1

    override fun moveTo() {
        println("Грузовой автомобиль $name уехал")
    }

    override fun moveBack() {
        println("Грузовой автомобиль $name вернулся пустой")
    }

    override fun loadPassenger() {
        println("Грузовой автомобиль $name загрузил $numberOfPassengers пассажира")
    }

    override fun unloadPassenger() {
        println("Грузовой автомобиль $name выгрузил $numberOfPassengers пассажира")
    }

    override fun loadCargo() {
        println("Грузовой автомобиль $name загрузил груз ($numberOfTons т.)")
    }

    override fun unloadCargo() {
        println("Грузовой автомобиль $name выгрузил груз")
    }
}


fun main() {

    var passengers =0
    var cargo = 0

    val car1 = Car("Audi", 3)
    val truck1 = Truck("Ford", 2)

    println()
    truck1.loadPassenger()
    truck1.loadCargo()
    car1.loadPassenger()
    truck1.moveTo()
    car1.moveTo()
    truck1.unloadPassenger()
    truck1.unloadCargo()
    car1.unloadPassenger()
    println()

    passengers += (car1.numberOfPassengers + truck1.numberOfPassengers)
    cargo += truck1.numberOfTons

    truck1.moveBack()
    car1.moveBack()
    println()

    car1.numberOfPassengers = 2

    car1.loadPassenger()
    car1.moveTo()
    car1.unloadPassenger()
    println()
    car1.moveBack()
    println()

    passengers += car1.numberOfPassengers

    println("Перевезено пассажиров: $passengers чел.")
    println("Перевезено груза: $cargo т")
}



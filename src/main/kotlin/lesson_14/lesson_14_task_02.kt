package org.example.lesson_14


open class NewLiner(
    val name: String,
    val speed: Int = 30,
    val cargoCapacity: Int = 10000,
    val passengerCapacity: Int = 1500,
) {

    open fun wayOfLoading() {
        println("Лайнер $name выдвигает горизонтальный трап со шкафута")
    }

    fun printInfo() {
        println("""
            Название судна: $name
            Скорость: $speed узлов
            Грузоподъёмность: $cargoCapacity тонн
            Вместимость пассажиров: $passengerCapacity человек
        """.trimIndent())
    }
}


class NewCargoShip(
    name: String,
    speed: Int = 20,
    cargoCapacity: Int = 60000,
    passengerCapacity: Int = 50,
) : NewLiner(name, speed, cargoCapacity, passengerCapacity) {

    override fun wayOfLoading() {
        println("Грузовой корабль $name активирует погрузочный кран")
    }
}


class NewIcebreaker(
    name: String,
    speed: Int = 15,
    cargoCapacity: Int = 5000,
    passengerCapacity: Int = 30,
) : NewLiner(name, speed, cargoCapacity, passengerCapacity) {

    fun breakIce() {
        println("Ледокол ломает лёд")
    }

    override fun wayOfLoading() {
        println("Ледокол $name открывает ворота со стороны кормы")
    }
}


fun main() {
    val liner1 = NewLiner("Liner1")
    val cargoShip1 = NewCargoShip("CargoShip1")
    val icebreaker1 = NewIcebreaker("Icebreaker1")

    liner1.printInfo()
    println()
    cargoShip1.printInfo()
    println()
    icebreaker1.printInfo()
    println()
}

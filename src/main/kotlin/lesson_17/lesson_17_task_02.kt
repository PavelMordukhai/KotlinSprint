package org.example.lesson_17


class Ship(
    name: String,
    private var averageSpeed: Int,
    private var homePort: String,
) {
    var name = name
        set(value) {
            field = name
            println("Имя корабля менять нельзя")
        }
}


fun main() {
    val ship1 = Ship("Беда", 11, "Морской Фасад")

    ship1.name = "Победа"
    println("Имя корабля - ${ship1.name}")
}

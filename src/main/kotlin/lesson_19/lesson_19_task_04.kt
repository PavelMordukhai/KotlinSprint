package org.example.lesson_19

enum class TypesOfAmmunition(val attackPower: Int) {
    BLUE_AMMO(5),
    GREEN_AMMO(10),
    RED_AMMO(20),
}

class Tank {
    init {
        println("Танк не заряжен")
    }

    fun getNewTypeOfAmmo(ammo: TypesOfAmmunition): TypesOfAmmunition = ammo

    fun shoot(typeOfAmmo: TypesOfAmmunition) {
        println("Нанесённый урон = ${typeOfAmmo.attackPower}")
    }
}

fun main() {
    val tank = Tank()
    println()

    val typeOfAmmo1 = tank.getNewTypeOfAmmo(TypesOfAmmunition.BLUE_AMMO)
    tank.shoot(typeOfAmmo1)

    val typeOfAmmo2 = tank.getNewTypeOfAmmo(TypesOfAmmunition.GREEN_AMMO)
    tank.shoot(typeOfAmmo2)

    val typeOfAmmo3 = tank.getNewTypeOfAmmo(TypesOfAmmunition.RED_AMMO)
    tank.shoot(typeOfAmmo3)
}

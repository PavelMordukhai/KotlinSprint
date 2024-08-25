package org.example.lesson_19

enum class TypesOfProjectile(
    val type: String,
    val attackPower: Int
) {
    BLUE_PROJECTILE("Синий", 5),
    GREEN_PROJECTILE("Зелёный", 10),
    RED_PROJECTILE("Красный", 20),
}

class Tank {
    private val projectileList: MutableList<TypesOfProjectile> = mutableListOf()
    private var isLoaded = false
    private var currentProjectile: TypesOfProjectile? = null

    init {
        println("Вы в танке. У вас пока нет снарядов.")
    }

    // подобрать снаряд
    fun pickUpProjectile(projectile: TypesOfProjectile) {
        println("Вы подобрали ${projectile.type} тип снаряда.")
        projectileList.add(projectile)
    }

    // зарядить пушку
    fun load(projectile: TypesOfProjectile) {
        if (isLoaded) {
            println("Вы выбрали ${projectile.type} тип снаряда.")
            println("Но пушка уже заряжена.")
            return
        }
        if (projectile in projectileList) {
            projectileList.remove(projectile)
            isLoaded = true
            currentProjectile = projectile
            println("Вы выбрали ${projectile.type} тип снаряда.")
            println("Пушка заряжена.")
        } else {
            println("Вы выбрали ${projectile.type} тип снаряда.")
            println("Но такого снаряда нет в наличии.")
            println("Пушка не заряжена.")
        }
    }

    // выстрелить
    fun shoot() {
        if (isLoaded && currentProjectile != null) {
            println("Произведён выстрел!")
            println("Нанесённый урон = ${currentProjectile?.attackPower}.")
            isLoaded = false
            currentProjectile = null
        } else {
            println("Вы пытаетесь выстрелить, но пушка не заряжена.")
            isLoaded = false
            currentProjectile = null
        }
    }
}

fun main() {
    val tank = Tank()
    println()

    tank.shoot()
    println()

    tank.pickUpProjectile(TypesOfProjectile.BLUE_PROJECTILE)
    tank.pickUpProjectile(TypesOfProjectile.GREEN_PROJECTILE)
    tank.pickUpProjectile(TypesOfProjectile.RED_PROJECTILE)
    println()

    tank.load(TypesOfProjectile.BLUE_PROJECTILE)
    println()
    tank.load(TypesOfProjectile.GREEN_PROJECTILE)
    println()
    tank.shoot()
    println()

    tank.load(TypesOfProjectile.BLUE_PROJECTILE)
    println()
    tank.load(TypesOfProjectile.GREEN_PROJECTILE)
    println()
    tank.shoot()
    println()

    tank.load(TypesOfProjectile.RED_PROJECTILE)
    println()
    tank.shoot()
}

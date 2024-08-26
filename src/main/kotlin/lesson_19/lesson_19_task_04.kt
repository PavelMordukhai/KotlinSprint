package org.example.lesson_19

enum class TypesOfProjectile(
    val type: String,
    val attackPower: Int
) {
    BLUE_PROJECTILE("Синий", 5),
    GREEN_PROJECTILE("Зелёный", 10),
    RED_PROJECTILE("Красный", 20),
}

class Tank(
    private var currentProjectile: TypesOfProjectile? = null
) {
    private var isLoaded = false

    init {
        if (currentProjectile == null)
            println("Вы в танке. Пушка не заряжена.")
        else {
            isLoaded = true
            println("Вы в танке. Пушка заряжена. Тип снаряда - ${currentProjectile?.type}")
        }
    }

    fun loadCannon(projectile: TypesOfProjectile) {
        if (isLoaded) {
            println("Вы не можете зарядить пушку.")
            println("Она уже заряжена. Тип снаряда - ${currentProjectile?.type}")
            return
        }
        isLoaded = true
        currentProjectile = projectile
        println("Пушка заряжена. Тип снаряда - ${projectile.type}")
    }

    fun shoot() {
        if (isLoaded) {
            println("Произведён выстрел!")
            println("Нанесённый урон = ${currentProjectile?.attackPower}.")
            isLoaded = false
            currentProjectile = null
        } else {
            println("Вы не можете выстрелить. Пушка не заряжена.")
        }
    }
}

fun main() {
    val tank = Tank(TypesOfProjectile.BLUE_PROJECTILE)
    println()
    tank.loadCannon(TypesOfProjectile.GREEN_PROJECTILE)
    println()
    tank.shoot()
    println()
    tank.shoot()
    println()
    tank.loadCannon(TypesOfProjectile.GREEN_PROJECTILE)
    println()
    tank.shoot()
    println()
    tank.loadCannon(TypesOfProjectile.RED_PROJECTILE)
    println()
    tank.shoot()
}

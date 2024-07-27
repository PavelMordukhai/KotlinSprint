package org.example.lesson_04

fun main() {

    val shipDamage = readln().toBoolean() // есть ли повреждения?
    val crew = readln().toInt() // состав экипажа
    val provisionBoxes = readln().toInt() // количество ящиков с провизией
    val weather = readln().toBoolean() // благоприятная ли погода?

    println("Может ли корабль отправиться в плавание? " +
            "${((shipDamage == SHIP_DAMAGE) && (crew in MIN_CREW..MAX_CREW) && 
                    (provisionBoxes > MIN_PROVISION_BOXES) && (weather == WEATHER)) ||
                    ((crew == MAX_CREW) && (weather == WEATHER) && (provisionBoxes >= MIN_PROVISION_BOXES))}")
}

// обязательные условия для долгосрочного плавания
const val SHIP_DAMAGE = false // корабль не имеет повреждений
const val MIN_CREW = 55 // минимальный экипаж (включительно)
const val MAX_CREW = 70 // максимальный экипаж (включительно)
const val MIN_PROVISION_BOXES = 50 // минимум ящиков провизии (не включительно)
const val WEATHER = true // благоприятная погода
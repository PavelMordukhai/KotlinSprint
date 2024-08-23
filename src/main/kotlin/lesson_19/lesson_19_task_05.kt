package org.example.lesson_19

const val NUMBER_OF_PERSONS = 5

enum class Gender(val gender: String) {
    MALE("м"),
    MALE_2("муж"),
    MALE_3("мужской"),
    MALE_4("m"),
    MALE_5("male"),
    FEMALE("ж"),
    FEMALE_2("жен"),
    FEMALE_3("женский"),
    FEMALE_4("f"),
    FEMALE_5("female"),
}

class Person(
    val name: String,
    val gender: String
)

fun main() {
    val dataFiles: MutableList<Person> = mutableListOf()

    printInstruction()

    for (i in 1..NUMBER_OF_PERSONS) {
        println("Человек № $i")

        print("Введите имя: ")
        val name = setName()

        print("Введите пол (м / ж): ")
        val gender = setGenderData()

        val person = Person(name, gender)
        println()
        dataFiles.add(person)
    }

    printDataFiles(dataFiles)
}

fun printInstruction() {
    println("""
        В картотеку необходимо ввести данные о количестве человек = $NUMBER_OF_PERSONS.
        
        Графу "Введите имя:" можно не заполнять.
        Ввод пола - любое значение из данных списков в любом регистре:
        - для мужского пола: м, муж, мужской, m, male;
        - для женского пола: ж, жен, женский, f, female
        
    """.trimIndent())
}

fun setName(): String {
    val name = readln().trim()
    if (name.trim().isEmpty())
        return "Нет данных"
    return name
}

fun checkGenderData(gender: String): Boolean {
    for (g in Gender.entries) {
        if (g.gender == gender)
            return true
    }
    return false
}

fun setGenderData(): String {
    var gender = ""
    do {
        gender = readln().trim().lowercase()
        if (checkGenderData(gender))
            break
        else
            print("Повторите ввод пола: ")
    } while (true)
    return gender
}

fun printDataFiles(dataFiles: MutableList<Person>) {
    println("-----\n\nНовые данные в картотеке:\n")
    for ((i, value) in dataFiles.withIndex()) {
        println("Человек № ${i + 1}")
        println("Имя: ${value.name}")

        val gender = when(value.gender.first()) {
            'м', 'm' -> "мужской"
            'ж', 'f' -> "женский"
            else -> "неизвестно"
        }
        println("Пол: $gender\n")
    }
}

package org.example.lesson_19

enum class FishSpecies(val species: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок"),
}

fun main() {
    val listOfFishSpecies = FishSpecies.entries

    println("Вы можете добавить в свой аквариум следующие виды рыб:")
    for ((index, value) in listOfFishSpecies.withIndex()) {
        print("- ${value.species}")
        if (index < listOfFishSpecies.size - 1)
            println(";")
    }
}

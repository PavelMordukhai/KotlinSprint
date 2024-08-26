package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String {
    val maxSkillPointsNamesList: MutableList<String> = mutableListOf()
    val maxSkillPoints = this.values.max()

    for ((key, value) in this) {
        if (value == maxSkillPoints) {
            maxSkillPointsNamesList.add(key)
        }
    }

    return if (maxSkillPointsNamesList.size == 1)
        maxSkillPointsNamesList[0]
    else
        maxSkillPointsNamesList.random()
}

fun main() {
    val skill1 = mapOf("qwe" to 7)
    val skill2 = mapOf("qwe" to 7, "asd" to 9, "fgh" to 9, "jhg" to 9, "uio" to 5)
    val skill3 = mapOf("qwe" to 7, "asd" to 6, "fgh" to 8, "jhg" to 9, "uio" to 5)

    println(skill1.maxCategory())
    println(skill2.maxCategory())
    println(skill3.maxCategory())
}

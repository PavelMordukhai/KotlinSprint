package org.example.lesson_20

class Robot {
    private val robotPhrases = listOf(
        "Я кибернетический организм",
        "Пока моя миссия не завершена, я должен функционировать",
        "У меня есть подробные данные о человеческой анатомии",
        "Моя батарейка рассчитана на 120 лет",
        "У меня нейросетевой центральный процессор"
    )
    private var modifier: ((String) -> String) = { it }

    fun say() {
        var text = robotPhrases.random()
        text = modifier(text)
        println(text)
    }

    fun setModifier(mod: (String) -> String) {
        this.modifier = mod
    }
}

fun main() {
    val robot = Robot()
    val reversedStringMod: (String) -> String = { it.reversed() }

    robot.say()
    robot.setModifier(reversedStringMod)
    robot.say()
}

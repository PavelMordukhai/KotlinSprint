package org.example.lesson_20

class Robot {
    private val robotPhrases = listOf(
        "Я кибернетический организм",
        "Пока моя миссия не завершена, я должен функционировать",
        "У меня есть подробные данные о человеческой анатомии",
        "Моя батарейка рассчитана на 120 лет",
        "У меня нейросетевой центральный процессор"
    )

    fun say(mod: ((String) -> String)? = null) {
        var text = robotPhrases.random()
        if (mod != null)
            text = mod(text)
        println(text)
    }

    fun setModifier(stringModifier: (String) -> String) = stringModifier
}

fun main() {
    val robot = Robot()
    val reversedString: (String) -> String = { it.reversed() }

    robot.say()
    val reversedStringMod = robot.setModifier(reversedString)
    robot.say(reversedStringMod)
}

package org.example.lesson_20

enum class RobotPhrases(val phrase: String) {
    PHRASE_1("Я кибернетический организм"),
    PHRASE_2("Пока моя миссия не завершена, я должен функционировать"),
    PHRASE_3("У меня есть подробные данные о человеческой анатомии"),
    PHRASE_4("Моя батарейка рассчитана на 120 лет"),
    PHRASE_5("У меня нейросетевой центральный процессор"),
}

fun main() {
    val reversedString: (String) -> String = { it.reversed() }

    say()
    val mod = setModifier(reversedString)
    say(mod)
}

fun say(mod: ((String) -> String)? = null) {
    var text = RobotPhrases.entries.random().phrase
    if (mod != null)
        text = mod(text)
    println(text)
}

fun setModifier(stringModifier: (String) -> String) = stringModifier

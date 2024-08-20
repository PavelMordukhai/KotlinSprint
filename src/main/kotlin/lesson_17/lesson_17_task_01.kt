package org.example.lesson_17


class QuizQuestionAndAnswer(
    question: String,
    answer: String,
) {
    val currentQuestion = question
        get() = field

    var currentAnswer = answer
        get() = field
        set(value) {
            field = value
        }
}


fun main() {

    val quiz1 = QuizQuestionAndAnswer(
        "Is it the question?",
        "It is the first answer"
    )
    println(quiz1.currentQuestion)
    println(quiz1.currentAnswer)

    quiz1.currentAnswer = "It is the second answer"
    println(quiz1.currentAnswer)
}

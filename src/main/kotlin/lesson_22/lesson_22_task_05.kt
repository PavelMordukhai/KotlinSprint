package org.example.lesson_22

data class GalacticGuide(
    val placeOrEventName: String,
    val placeOrEventDescription: String,
    val dateAndTime: String? = null,
    val distanceFromEarth: Double
)

fun main() {
    val starSystem = GalacticGuide(
        placeOrEventName = "Alpha Centauri",
        placeOrEventDescription =
        """
            Описание:  
            - тройная звёздная система в созвездии Центавра;
            - все три звезды являются ближайшими звёздами к Солнцу.
        """.trimIndent(),
        dateAndTime = "6 млрд лет назад",
        distanceFromEarth = 4.36
    )

    println("Звёздная система ${starSystem.component1()}\n")
    println("${starSystem.component2()}\n")
    println("Возникла примерно ${starSystem.component3()}\n")
    println("Расстояние от Земли примерно ${starSystem.component4()} световых лет")
}

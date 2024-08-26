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

    val name = starSystem.component1()
    val description = starSystem.component2()
    val date = starSystem.component3()
    val distance = starSystem.component4()

    println("Звёздная система $name\n")
    println("$description\n")
    println("Возникла примерно $date\n")
    println("Расстояние от Земли примерно $distance световых лет")
}

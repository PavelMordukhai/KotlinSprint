package org.example.lesson_14


open class CelestialBody(
    val name: String,
    val isAtmosphere: Boolean = false,
    val suitableForLanding: Boolean = false,
)


class Planet(
    name: String,
    isAtmosphere: Boolean = false,
    suitableForLanding: Boolean = false,
    val satellites: List<SatelliteOfThePlanet>? = null,
) : CelestialBody(name, isAtmosphere, suitableForLanding)


class SatelliteOfThePlanet(
    name: String,
    isAtmosphere: Boolean = false,
    suitableForLanding: Boolean = false,
) : CelestialBody(name, isAtmosphere, suitableForLanding)


fun main() {

    val marsSatellite1 = SatelliteOfThePlanet("Phobos")
    val marsSatellite2 = SatelliteOfThePlanet("Deimos")

    val planet4 = Planet(
        name = "Mars",
        isAtmosphere = true,
        suitableForLanding = true,
        satellites = listOf(marsSatellite1, marsSatellite2))

    println("Planet: ${planet4.name}")

    println("Satellites: ${marsSatellite1.name}, ${marsSatellite2.name}")
}

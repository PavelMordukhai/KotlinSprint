package org.example.lesson_15


interface FlyingCreature {
    fun fly()
}


interface FloatingCreature {
    fun float()
}


class Crucian : FloatingCreature {

    override fun float() {
        println("Карась плавает под водой")
    }
}


class Seagull : FlyingCreature, FloatingCreature {

    override fun fly() {
        println("Чайка летает")
    }

    override fun float() {
        println("Чайка плавает на поверхности воды")
    }
}


class Duck : FlyingCreature, FloatingCreature {

    override fun fly() {
        println("Утка летает")
    }

    override fun float() {
        println("Утка плавает на поверхности воды и может ненадолго нырнуть")
    }
}


fun main() {

    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.float()
    seagull.fly()
    seagull.float()
    duck.fly()
    duck.float()
}

package org.example.lesson_20

fun main() {
    val splashScreenString: (String) -> String = { "С наступающим Новым Годом, $it!" }
    println(splashScreenString("Qwerty"))
}

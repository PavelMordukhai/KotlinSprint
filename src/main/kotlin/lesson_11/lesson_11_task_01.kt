package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)


fun main() {

    val firstUser = User(
        id = 1,
        login = "qwerty",
        password = "123456seven",
        mail = "qwerty@mymail.com"
    )

    val secondUser = User(
        id = 2,
        login = "Frodo",
        password = "my-precious",
        mail = "gollum@mymail.com"
    )

    printInfo(firstUser)
    println()
    printInfo(secondUser)
}

fun printInfo(user: User) {
    println(user.id)
    println(user.login)
    println(user.password)
    println(user.mail)
}
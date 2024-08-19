package org.example.lesson_16


class User(
    private val login: String,
    private val password: String,
) {
    fun validatePassword(password: String) = (password == this.password)
}


fun main() {
    val user1 = User("qwerty", "123456seven")

    print("Введите пароль: ")
    val password = readln()

    println(user1.validatePassword(password))
}

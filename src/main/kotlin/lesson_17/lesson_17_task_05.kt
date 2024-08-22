package org.example.lesson_17

class User(
    login: String,
    password: String,
) {
    var login = login
        set(value) {
            field = value
            println("Логин успешно изменён")
        }

    var password = password
        get() {
            var str = ""
            repeat(field.length) {
                str += "*"
            }
            return str
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user1 = User("qwerty", "asdfgGFDSA")

    user1.password = "seven"
    println(user1.password)
    println()

    println(user1.login)
    user1.login = "frodo"
    println(user1.login)
}

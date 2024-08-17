package org.example.lesson_15


abstract class ForumUser(
    val username: String
) {

    abstract fun readMessages()
    abstract fun writeMessages()
}


class OrdinaryUser(
    username: String
) : ForumUser(username) {

    override fun readMessages() {
        println("$username прочитал сообщение")
    }

    override fun writeMessages() {
        println("$username опубликовал сообщение")
    }
}


class ForumAdmin(
    username: String,
) : ForumUser(username) {

    fun delMessage(user: OrdinaryUser) {
        println("$username удалил сообщение пользователя ${user.username}")
    }

    fun delOrdinaryUser(user: OrdinaryUser) {
        println("$username удалил аккаунт пользователя ${user.username}")
    }

    override fun readMessages() {
        println("$username прочитал сообщение")
    }

    override fun writeMessages() {
        println("$username опубликовал сообщение")
    }
}


fun main() {

    val user1 = OrdinaryUser("qwerty")
    val admin1 = ForumAdmin("Admin")

    user1.readMessages()
    user1.writeMessages()
    println()
    admin1.readMessages()
    println()
    admin1.delMessage(user1)
    admin1.delOrdinaryUser(user1)
    println()
    admin1.writeMessages()
}

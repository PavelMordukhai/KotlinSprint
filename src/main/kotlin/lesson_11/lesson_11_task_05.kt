package org.example.lesson_11

/*
Задача 5* к Уроку 11

Реализовать класс работы форума (Forum).
Для реализации создай дополнительные классы для сущностей
“Член форума” (с полями userId и userName) и “Сообщение форума” (с полями authorId и message).

Примени паттерн “Фабрика” для создания пользователей и сообщений форума.
Напрямую объекты не создаются, логика должна быть инкапсулирована внутри методов класса.

- createNewUser() создает новых пользователей, принимая имя пользователя.
Метод сохраняет нового пользователя в общий список и одновременно возвращает новый объект.
Генерация id-шников новых пользователей происходит внутри;
- createNewMessage() создает сообщения, принимая id пользователя.
Сообщения создаются только если такой пользователь есть на форуме;
- printThread() печатает в консоль все сообщения добавленные на форум в формате:

    автор: сообщение
    автор: сообщение

Создай экземпляр Forum и продемонстрируй его работу,
добавив двух пользователей и по два сообщения от каждого пользователя.
 */

val membersList: MutableList<String> = mutableListOf()

class Forum() {

    fun createNewUser(userName: String): ForumMember {
        membersList.add(userName)
        val userId = membersList.indexOf(userName) + 1
        return ForumMember(userId, userName)
    }

    fun createNewMessage(authorId: Int): ForumMessage {
        var message = ""
        if (membersList.size >= authorId)
            message = "A message from ${membersList[authorId - 1]}"
        return ForumMessage(authorId, message)
    }

    fun printThread() {
        for (item in membersList.indices) {
            println("${membersList[item]}: ${createNewMessage(item + 1).message}")
        }
    }
}


class ForumMember(
    val userId: Int,
    val userName: String,
)


class ForumMessage(
    val authorId: Int,
    val message: String,
)


fun main() {

    val firstUser: Forum = Forum()
    firstUser.createNewUser("Frodo")

    val secondUser: Forum = Forum()
    secondUser.createNewUser("Gollum")

    Forum().printThread()
    Forum().printThread()
}
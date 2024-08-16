package org.example.lesson_14

/*
Задача 5* к Уроку 14

Создай класс Chat, который реализует обсуждение в мессенджере, аналогичному Discord.
Класс должен иметь следующие методы:

- addMessage() — добавляет обычное сообщение в чат, принимает на вход текст и автора сообщения;
- addThreadMessage() — добавляет сообщение в тред к предыдущему сообщению (для начала обсуждения),
дополнительно принимает на вход parentMessageId для идентификации сообщения,
под которым создается ветка обсуждения;

Сообщения чата должны храниться в списке, в классе Chat.
Для создания сообщений соответствующих типов
используй классы Message и ChildMessage в соответствующей иерархии.
У каждого типа сообщения должен быть id.

- printChat() — печатает все сообщения чата.
Если создано дочернее сообщение, необходимо применить для вывода табуляцию
и печатать его под родительским сообщением.
Используй groupBy() для группировки сообщений по parentMessageId,
если сообщение является экземпляром ChildMessage, или по id если это обычное сообщение.
 */


open class Chat() {

    var messageList: MutableList<Message> = mutableListOf()

    fun addMessage(
        messageText: String,
        messageAuthor: String
    ) {
        messageList.add(Message(messageText, messageAuthor))
    }

    fun addThreadMessage(
        messageText: String,
        messageAuthor: String,
        parentMessageId: Int
    ) {
        messageList.add(ChildMessage(messageText, messageAuthor))
    }

    fun printChat() {

        for (i in messageList) {
            when (i.id) {
                2 -> println("\t${i.messageText}")
                else -> println(i.messageText)
            }
        }
        println()

        //
        val idMap = messageList.groupBy { it.id }

        for (id in idMap) {
            println(id.key)
            for (message in id.value)
                println(message.messageText)
        }
    }
}


open class Message(
    val messageText: String,
    val messageAuthor: String,
) : Chat() {

    open val id: Int = 1
}


class ChildMessage(
    messageText: String,
    messageAuthor: String,
) : Message(messageText, messageAuthor) {

    override val id: Int = 2
}


fun main() {

    val chat1 = Chat()

    chat1.messageList = mutableListOf(
        Message("qqq1", "a1"),
        Message("qqq2", "a2"),
        ChildMessage("qqq3", "a3"),
        Message("qqq4", "a4"),
        ChildMessage("qqq5", "a5"),
        ChildMessage("qqq6", "a6"),
        Message("qqq7", "a7"),
    )

    chat1.printChat()
    println()

//    val message1 = Message("qqq1", "qqas der fgt")
//    val message2 = Message("qqq2", "der fgt hyu")
//    val message3 = ChildMessage("qqq3", "fgt nhy")
//    val message4 = Message("qqq4", "qqas der fgt")
//    val message5 = ChildMessage("qqq5", "der fgt hyu")
//    val message6 = ChildMessage("qqq6", "der fgt hyu")
//    val message7 = Message("qqq7", "der fgt hyu")

}
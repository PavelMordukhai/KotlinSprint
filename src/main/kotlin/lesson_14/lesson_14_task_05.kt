package org.example.lesson_14


open class Chat() {

    var messageList: MutableList<Message> = mutableListOf()
    var threadMessageList: MutableList<ChildMessage> = mutableListOf()

    fun addMessage(
        id: Int,
        messageText: String,
        messageAuthor: String
    ) {
        messageList.add(Message(id, messageText, messageAuthor))
    }

    fun addThreadMessage(
        parentMessageId: Int,
        id: Int,
        messageText: String,
        messageAuthor: String,

    ) {
        threadMessageList.add(ChildMessage(parentMessageId, id, messageText, messageAuthor))
    }

    fun printChat() {

        val threadsIdMap = threadMessageList.groupBy ({ it.parentMessageId }) {it.messageText}

        for (messageID in messageList.indices) {
            println((messageList[messageID]).messageText)

            for (pmID in threadsIdMap.keys) {
                if (pmID == messageID + 1) {
                    for (parentMessage in threadsIdMap[pmID]!!)
                        println("\t$parentMessage")
                }
            }
        }
    }
}


open class Message(
    var id: Int = 1,
    val messageText: String,
    val messageAuthor: String,
    ) : Chat()


class ChildMessage(
    var parentMessageId: Int,
    id: Int = 1,
    messageText: String,
    messageAuthor: String,
) : Message(id, messageText, messageAuthor)


fun main() {

    val chat1 = Chat()

    chat1.messageList = mutableListOf(
        Message(1, "message 1", "a1"),
        Message(2, "message 2", "a2"),
        Message(3, "message 3", "a4"),
        Message(4, "message 4", "a7"),
    )

    chat1.threadMessageList = mutableListOf(
        ChildMessage(2, 1, "parent message 2-1", "a3"),
        ChildMessage(3, 1, "parent message 3-1", "a5"),
        ChildMessage(3, 2, "parent message 3-2", "a6"),
    )

    chat1.printChat()
    println()
}

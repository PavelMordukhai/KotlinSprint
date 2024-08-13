package org.example.lesson_11

// комнаты по интересам
class Room(
    val cover: String,
    val title: String,
    val nicknamesList: MutableList<String>,
    val avatarsList: MutableList<String>,
    val statusesList: MutableList<String>,
) {
    private val memberStatus = arrayOf("разговаривает", "микрофон выключен", "пользователь заглушен")

    // добавить участника
    fun addMember(member: RoomMember) {
        nicknamesList.add(member.nickname)
        avatarsList.add(member.avatar)
        statusesList.add(memberStatus[0])
    }


    // обновить статус участника
    fun updateMemberStatus(nickname: String, status: String) {
        val memberIndex = nicknamesList.indexOf(nickname)
        val statusIndex = memberStatus.indexOf(status)

        if ((memberIndex == -1) || (statusIndex == -1))
            println("Неверные данные")
        else
            statusesList[memberIndex] = memberStatus[statusIndex]
    }
}


// участники комнаты (ДЛЯ ТЕСТА)
class RoomMember(
    val nickname: String,
    val avatar: String,
)


fun main() {

    val roomOne = Room(
        cover = "cover.jpg",
        title = "Сериалы",
        nicknamesList = mutableListOf("Вася", "Петя", "Таня", "Голлум"),
        avatarsList = mutableListOf("Вася.jpg", "Петя.jpg", "Таня.jpg", "Голлум.jpg"),
        statusesList = mutableListOf(
            "разговаривает", "пользователь заглушен",
            "микрофон выключен", "микрофон выключен"
        ),
    )
}

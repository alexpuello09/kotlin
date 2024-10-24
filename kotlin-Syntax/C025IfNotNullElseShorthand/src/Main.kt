data class User(val name: String?)

fun main() {
    val user1 = User("Alex")
    val user2 = User(null)

    val userName1 = user1.name ?: "Unknown User"
    val userName2 = user2.name ?: "Unknown User"

    println(userName1)
    println(userName2)
}

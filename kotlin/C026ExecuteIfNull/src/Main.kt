fun main() {
    val id = student["id"] ?: throw IllegalStateException("Id is missing!")
    println(id)
}

val student = mapOf("username" to "alex", "email" to "mail123@gmail.com", "id" to 2)

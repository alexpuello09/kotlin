fun main() {
    println(mainEmail)
}

val emails = mapOf<String, String>()
val mainEmail = emails.firstNotNullOfOrNull { it.value } ?: "The map is empty"
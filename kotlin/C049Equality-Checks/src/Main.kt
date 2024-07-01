fun main() {
    val authors = setOf("Shakespeare", 23, "Twain")
    val writers = setOf("Twain", "Shakespeare", 23)

    println(authors == writers)
    println(authors === writers)
}
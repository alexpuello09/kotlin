fun main() {
    val value: String? = null
    val mapped = value?.let { transformValue(it) } ?: "The value of the variable is null"

    println(mapped)
}

fun transformValue(input: String): String {
    return input.lowercase()
}
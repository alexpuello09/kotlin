fun main() {
    println(result())
    println( transform("Red"))
}

fun result(): Int = 42
fun transform(color: String): Int = when (color) {
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param value")
}
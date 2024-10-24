fun main() {
    println(result())
    println( transform("Red"))
}

fun result(): Int = 42
fun transform(color: String): String = when (color) {
    "Red" -> "Rojo"
    "Green" -> "Verde"
    "Blue" -> "Azul"
    else -> throw IllegalArgumentException("Invalid color param value")
}
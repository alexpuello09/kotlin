fun main() {
    val result = transform("Red")
    println(result)
}


fun transform(color: String): Int{
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}
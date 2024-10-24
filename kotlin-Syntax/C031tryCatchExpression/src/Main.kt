fun main() {
    val result = try {
        divide()
    } catch (e: ArithmeticException) {
        throw IllegalArgumentException("Error")
    }
    println(result)
}

fun divide(): Int {
    return  10 / 0
}
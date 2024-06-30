fun main() {
    val x = 9
    val y = 11
    if (x in 1..y - 1) {
        println("It is in the range")
    }
    println()

    val letters = listOf("a", "b", "c")
    if (-1 !in 0..letters.lastIndex) {
        println("-1 is out of the range")
    }
    println()

    if (letters.size !in letters.indices) {
        println("list size is out of valid list indices range")
    }
    println()

    for (i in 0..5) {
        print(i)
    }
    println()

    for (i in 1..10 step 2) {
        print(i)
    }

    println()
    for (i in 10 downTo 0 step  2) {
        print(i)
    }
}
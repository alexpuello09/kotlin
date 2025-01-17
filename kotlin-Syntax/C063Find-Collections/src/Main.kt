fun main() {
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

    val first = words.find { it.startsWith("some") }                                // 2
    val last = words.findLast { it.startsWith("some") }                             // 3
    val nothing = words.find { it.contains("nothing") }

    println("The first word starting with some is $first")
    println("The last word starting with some is $first")
    println("The first first containing nothing is $nothing")
}
fun main() {
    val students = listOf("Alex", "Juan", "Eliezer", "Emmanuel", "Emanuel")
    for (item in students) {
        println(item)
    }

    when {
        "Emanuel" in students -> println("Emanuel came today")
    }
    println()

    students
        // high level operations over collections
        .filter {it.startsWith("E")}
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    println()
    val fruits = listOf("apple", "banana", "pear", "grape", "pineapple")
        fruits.filter { it.startsWith("p") }
            .map { it.uppercase() }
            .forEach { println(it) }
}

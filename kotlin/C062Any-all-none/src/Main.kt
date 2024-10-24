fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }
    println(anyNegative)
    println(anyGT6)
    println()

    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }
    println(allEven)
    println(allLess6)
    println()

    val allEvenOrNot = numbers.none { it % 2 == 1 }
    val allMoreThan6 = numbers.none { it > 6 }
    println(allEvenOrNot)
    println(allMoreThan6)
}
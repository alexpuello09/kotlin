fun main() {
    val fruits = listOf("banana", "apple", "pear", "grape")
    for (item in fruits) {
        println(item)
    }

    for (index in fruits.indices) {
        println("fruit at position $index is ${fruits[index]}")
    }
}
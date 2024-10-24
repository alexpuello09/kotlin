fun main() {
    val fruits = listOf("apple", "pear", "pineapple")
    var index = 0
    while (index < fruits.size) {
        println("fruit at position $index is ${fruits[index]}")
        index++
    }
}
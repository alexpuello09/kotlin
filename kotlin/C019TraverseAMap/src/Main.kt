fun main() {
    val productPriceMap = mapOf("Name" to "rice", "Pounds" to 5, "Price" to 200)
    for ((k, v) in productPriceMap) {
        println("$k -> $v")
    }
}
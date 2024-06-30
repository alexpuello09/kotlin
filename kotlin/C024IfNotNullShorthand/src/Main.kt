fun main() {
    val str: String? = null
    val result: Int
    result = str?.length ?: 0
    println(result)

    val str2: String? = "hello"
    println(str2?.length ?: 0)
}
